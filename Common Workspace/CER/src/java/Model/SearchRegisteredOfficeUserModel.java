/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import MongoDatabase.MongoDBConnection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Lucas.L.H.H
 */
public class SearchRegisteredOfficeUserModel {
    // Creating new object for database connection url
    MongoDBConnection mongoDB;

    public SearchRegisteredOfficeUserModel() {
        // Creating new object to retrieve database connection url
        mongoDB = new MongoDBConnection();
    }
    
    private String officerCEREmailAddress = null;
    
    // GETTER
    public String getOfficerCEREmailAddress() {
        return officerCEREmailAddress;
    }
    
    // SETTER
    public void setOfficerCEREmailAddress(String officerCEREmailAddress){
        this.officerCEREmailAddress = officerCEREmailAddress;
    } 
    
    public JSONObject SearchOfficeUser(){
        JSONObject nullJSONObject = new JSONObject();
        /* PROCESS OF RETRIEVING VALUES FROM MONGODB */
        try{
            // Establishing MongoDB URI Connection
            MongoClientURI uri = new MongoClientURI(mongoDB.MongoDBConnectionURL());
            MongoClient mongoClient = new MongoClient(uri);

            // Connecting to the MongoDB database
            MongoDatabase database = mongoClient.getDatabase("CERdb");

            // Connecting to the MongoDB collection
            MongoCollection collection = database.getCollection("users");    
            
            // Retrieving the document with the cerEmailAddress the user entered
            Document officeUserDocument = (Document) collection.find(Filters.eq("cerEmailAddress", officerCEREmailAddress)).first();
            
            // Checking if a document from the database was returned
            if(officeUserDocument != null){
                // A document was returned
                // Converting the retrieved value to JSON format and converting the JSON value to a JSON object
                JSONObject documentJSONObject = new JSONObject(officeUserDocument.toJson());
                // Returning the JSON object
                return documentJSONObject;
            }
            else if(officeUserDocument == null){
                // No document was returned
                return null;
            }  
        }
        catch (Exception ex) {
            System.out.println("ERROR: " + ex);  
        }
        return null;
    }
}
