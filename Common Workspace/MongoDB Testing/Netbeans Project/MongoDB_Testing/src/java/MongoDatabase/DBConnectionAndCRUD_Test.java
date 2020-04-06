/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MongoDatabase;

import com.mongodb.ErrorCategory;
import com.mongodb.MongoClient;
import com.mongodb.MongoWriteException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

import java.util.List;
import org.bson.Document;

/**
 *
 * @author Lucas.L.H.H
 */
public class DBConnectionAndCRUD_Test {
    
    public static void main(String args[]){

        try{
            // Connecting to the server
            MongoClient mongoClient = new MongoClient("localhost", 27017);
            System.out.println("Server Connection Successful");

            // Connecting to the database
            MongoDatabase database = mongoClient.getDatabase("myLibrary");
            System.out.println("Database Connection Successful");
            System.out.println("Database Name: " + database.getName());

            // To retrieve all database name
            List<String> dbNames = mongoClient.getDatabaseNames();
            System.out.println("All Available Databases: " + dbNames);

            // Connecting to the collection in the database 
            MongoCollection collection = database.getCollection("books");

            // Creating a new document
            Document first = new Document();            
            Document second = new Document();

            // Inserting data into the document
            first.append("_id", 1)
                    .append("bookTitle","Programming in Java")
                    .append("author", 
                            new Document("fistname", "James")
                            .append("lastname", "Anderson"))
                    .append("publishedDate","12th June, 2012");
            second.append("_id", 2)
                    .append("bookTitle","Programming in C#")
                    .append("author", 
                            new Document("fistname", "Andy")
                            .append("lastname", "Silvester"))
                    .append("publishedDate","23rd May, 2014");

            // Inserting the document into the collection
            try{
                collection.insertOne(first);                
                collection.insertOne(second);
            }
            catch(MongoWriteException ex){
                // Checking if the document ID is already existing error is shown
                if(ex.getError().getCategory().equals(ErrorCategory.DUPLICATE_KEY)){
                    System.out.println("Document ID Already Exists");
                }
            }

            // Retrieving all the documents
            MongoCursor cursor = collection.find().iterator();
            System.out.println("All Documents in the Collection");
            try{
                while(cursor.hasNext()){
                    System.out.println(cursor.next());
                }
            }
            finally{
                cursor.close();
            }

            // Retrieving one document from the collection
            Document secondRetrival = (Document) collection.find(Filters.eq("_id", 2)).first();
            System.out.println("Document ID 2: ");
            System.out.println(secondRetrival.toJson());

            // Updating one key value pair in the document
            collection.updateOne(new Document("_id", 2), new Document("$set", new Document("bookTitle", "Coding in C#")));
            Document secondRetrivalOneUpdated = (Document) collection.find(Filters.eq("_id", 2)).first();
            System.out.println("Document ID 2: (One Key Value Pair Updated): ");
            System.out.println(secondRetrivalOneUpdated.toJson());

            // Updating all the key value pairs in the document
            collection.updateOne(new Document("_id", 2), new Document("$set", new Document("bookTitle", "Coding in C#")
                    .append("author", new Document("firstName", "George")
                            .append("lastName", "Fransis"))
                    .append("publishedDate", "12th July, 2015")));
            Document secondRetrivalAllUpdated = (Document) collection.find(Filters.eq("_id", 2)).first();
            System.out.println("Document ID 2: (All Key Value Pair Updated): ");
            System.out.println(secondRetrivalAllUpdated.toJson());

            // Delete document from a collection
            collection.deleteOne(Filters.eq("_id", 1));

            // Delete all documents from a collection with document ID equal to 1 and greater
            collection.deleteOne(Filters.gte("_id", 1));

            // Retrieving all the documents
            MongoCursor cursorSecond = collection.find().iterator();
            System.out.println("All Documents in the Collection (No Documents)");
            try{
                while(cursorSecond.hasNext()){
                    System.out.println(cursor.next());
                }
            }
            finally{
                cursorSecond.close();
            }

            /*
            // Drop Database
            mongoClient.dropDatabase("myLibrary");
            dbNames = mongoClient.getDatabaseNames();
            System.out.println("All Available Databases: " + dbNames);
            */
        }
        catch(Exception ex){
            System.out.println("Error: " + ex);
        }
       
    }
    
}
