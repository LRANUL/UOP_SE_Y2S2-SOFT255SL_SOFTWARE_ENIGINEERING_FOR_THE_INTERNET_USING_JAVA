/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MongoDatabase;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.bson.Document;
import com.mongodb.client.FindIterable;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.gt;
import static com.mongodb.client.model.Filters.lt;

/**
 *
 * @author Lucas.L.H.H
 */
public class MongoDBConnection {

    /*
    *   DATABASE NAME = CERdb
    *   DATABASE Type = NoSQL
    *   DATABASE VENDOR = AWS 
    *   COLLECTION NAME FOR USERS = users
    *   COLLECTION NAME FOR CASES = cases
    *   COLLECTION NAME FOR DOCUMENTS = documents
    *   COLLECTION NAME FOR COMMENTS/MESSAGES = comments
     */
    // MAIN METHOD, CHECKING DATABASE CONNECTION STATUS
    public static void main(String[] args) {
        MongoClient mongoClient = MongoClients.create("mongodb://admin:p5Dy6BoofEB9JAeB@cers-shard-00-00-qwvj6.mongodb.net:27017,cers-shard-00-01-qwvj6.mongodb.net:27017,cers-shard-00-02-qwvj6.mongodb.net:27017/test?ssl=true&replicaSet=CERs-shard-0&authSource=admin&retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("CERdb");
        System.out.println("Database Connection Status: Success");
        System.out.println("Database Name: " + database.getName());
        Document DB_Statistics = database.runCommand(new Document("dbstats", 1));
        for (Map.Entry<String, Object> set : DB_Statistics.entrySet()) {

            System.out.format("%s: %s%n", set.getKey(), set.getValue());
        }
        // Case Search
        MongoCollection<Document> collection = database.getCollection("cases");

        try (MongoCursor<Document> col = collection.find().iterator()) {

            while (col.hasNext()) {

                Document document = col.next();
                ArrayList<Object> cases = new ArrayList<>(document.values());
                System.out.printf("CaseNo: %s\n", cases.get(1));
                System.out.printf("Case Location: %s\n", cases.get(2));
                System.out.printf("Case Party: %s\n", cases.get(3));
                System.out.printf("Date: %s\n", cases.get(4));
            }
        }

        BasicDBObject query = new BasicDBObject();
        query.put("CaseNo", "1J85");
        FindIterable document = collection.find(query);
        ArrayList<Document> docs = new ArrayList<Document>();
        document.into(docs);
        for (Document doc : docs) {
            System.out.println(doc);
        }
        
        
      /*ADD TO LOGIN SERVLET TO SEND TABLE UPDATES TO DASHBOARD.JSP*/
//    MongoClient mongoClient = MongoClients.create("mongodb://admin:p5Dy6BoofEB9JAeB@cers-shard-00-00-qwvj6.mongodb.net:27017,cers-shard-00-01-qwvj6.mongodb.net:27017,cers-shard-00-02-qwvj6.mongodb.net:27017/test?ssl=true&replicaSet=CERs-shard-0&authSource=admin&retryWrites=true&w=majority");
//    MongoDatabase database = mongoClient.getDatabase("CERdb");
//
//    // Case Load to Table
//    MongoCollection<Document> collection = database.getCollection("cases");
//
//     MongoCursor<Document> col = collection.find().iterator();%>
//
//    while (col.hasNext()) {
//        Document document = col.next();
//        ArrayList<Object> cases = new ArrayList<>(document.values());
//        request.setAttribute("cases", cases);
//    }


    }

    // Non Static method (An object must be created)
    public String MongoDBConnectionURL() {
        // Sending database connection URL to wherever called
        return "mongodb+srv://admin:p5Dy6BoofEB9JAeB@cers-qwvj6.mongodb.net/test?retryWrites=true&w=majority";
    }
}
