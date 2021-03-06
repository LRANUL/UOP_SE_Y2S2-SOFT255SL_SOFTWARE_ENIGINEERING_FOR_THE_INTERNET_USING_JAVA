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
            Document officeUserDocument = (Document) collection.find(Filters.eq("emailAddress", officerCEREmailAddress)).first();
            
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
    
    
    
    public Boolean updateOfficerAccountStatusActivate(){
        /* PROCESS OF UPDATING OFFICER ACCOUNT STATUS TO ACTIVE IN MONGODB */
        try{
            // Establishing MongoDB URI Connection
            MongoClientURI uri = new MongoClientURI(mongoDB.MongoDBConnectionURL());
            MongoClient mongoClient = new MongoClient(uri);

            // Connecting to the MongoDB database
            MongoDatabase database = mongoClient.getDatabase("CERdb");

            // Connecting to the MongoDB collection
            MongoCollection collection = database.getCollection("users");    
            
            // Updating accountStatus field in office user's document to 'Active'
            collection.updateOne(new Document("emailAddress", officerCEREmailAddress), new Document("$set", new Document("accountStatus", "Active")));
            
            // Retrieving the updated document
            Document updatedDocument = (Document) collection.find(Filters.eq("emailAddress", officerCEREmailAddress)).first();
            
            if(updatedDocument != null){
            
                // Converting the retrieved value to JSON format and converting the JSON value to a JSON object
                JSONObject documentJSONObject = new JSONObject(updatedDocument.toJson());
                
                String accountStatusDB = documentJSONObject.getString("accountStatus");
                
                if(accountStatusDB == "Active"){
                    return true;
                }
                else{
                    return false;
                }
                
            }
            else if(updatedDocument == null){
                return false;
            }
        }
        catch (Exception ex) {
            System.out.println("ERROR: " + ex);  
        }
        
        return false;
    }
    
    public Boolean updateOfficerAccountStatusDisable(){
        /* PROCESS OF UPDATING OFFICER ACCOUNT STATUS TO ACTIVE IN MONGODB */
        try{
            // Establishing MongoDB URI Connection
            MongoClientURI uri = new MongoClientURI(mongoDB.MongoDBConnectionURL());
            MongoClient mongoClient = new MongoClient(uri);

            // Connecting to the MongoDB database
            MongoDatabase database = mongoClient.getDatabase("CERdb");

            // Connecting to the MongoDB collection
            MongoCollection collection = database.getCollection("users");    
            
            // Updating accountStatus field in office user's document to 'Active'
            collection.updateOne(new Document("emailAddress", officerCEREmailAddress), new Document("$set", new Document("accountStatus", "Disabled")));
            
            // Retrieving the updated document
            Document updatedDocument = (Document) collection.find(Filters.eq("emailAddress", officerCEREmailAddress)).first();
            
            if(updatedDocument != null){
            
                // Converting the retrieved value to JSON format and converting the JSON value to a JSON object
                JSONObject documentJSONObject = new JSONObject(updatedDocument.toJson());
                
                String accountStatusDB = documentJSONObject.getString("accountStatus");
                
                if(accountStatusDB == "Disabled"){
                    return true;
                }
                else{
                    return false;
                }
                
            }
            else if(updatedDocument == null){
                return false;
            }
        }
        catch (Exception ex) {
            System.out.println("ERROR: " + ex);  
        }
        
        return false;
    }
}
