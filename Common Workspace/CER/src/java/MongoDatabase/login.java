/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MongoDatabase;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author Hp-Pc
 */
public class login {
    private static MongoClient getConnection() {
        int port_no = 27017;
        String url = "localhost";
 
        MongoClient mongoClntObj = new MongoClient(url, port_no);
        return mongoClntObj;
    }
     public static boolean searchUserInDb(String  uname, String pass , String users_T) {
        boolean user_found = false;
        // Get the mongodb connection
        
        MongoDatabase db = getConnection().getDatabase("CERdb");

        System.out.println("Database Connection Successful");
        System.out.println("Database Name: " + db.getName());
        // Get the mongodb collection.
        MongoCollection col = db.getCollection("users");
        // Get the particular record from the mongodb collection 
        BasicDBObject whereQuery = new BasicDBObject();
        
        List <BasicDBObject> obj = new <BasicDBObject> ArrayList();
        obj.add(new BasicDBObject("username", uname));
        obj.add(new BasicDBObject("password",pass));
        obj.add(new BasicDBObject("users",users_T));
        whereQuery.put("$and",obj);
        
        try (MongoCursor<Document> coll = col.find(whereQuery).iterator()){

            while (coll.hasNext()) {
                user_found=true;
            }
        }
        System.out.println("Found?= " + user_found);
        return user_found;
    }
}
