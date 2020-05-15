/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MongoDatabase;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import java.util.List;

/**
 *
 * @author Lucas.L.H.H
 */
public class MongoDBConnection {
    
    // MAIN METHOD, CHECKING DATABASE CONNECTION STATUS
    public static void main(String[] args) {
        MongoClient mongoClient = MongoClients.create("mongodb://admin:p5Dy6BoofEB9JAeB@cers-shard-00-00-qwvj6.mongodb.net:27017,cers-shard-00-01-qwvj6.mongodb.net:27017,cers-shard-00-02-qwvj6.mongodb.net:27017/test?ssl=true&replicaSet=CERs-shard-0&authSource=admin&retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("myLibrary");
        System.out.println("Database Connection Status: Success");
        System.out.println("Database Name: " + database.getName());
    }
    
    // Non Static method (An object must be created)
    public String MongoDBConnectionURL(){
        // Sending database connection URL to wherever called
        return "mongodb+srv://admin:p5Dy6BoofEB9JAeB@cers-qwvj6.mongodb.net/test?retryWrites=true&w=majority";
    }
}
