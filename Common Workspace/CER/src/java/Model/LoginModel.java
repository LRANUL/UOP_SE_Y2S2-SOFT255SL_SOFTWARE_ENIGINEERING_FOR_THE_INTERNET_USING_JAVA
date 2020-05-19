/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static Encryption.PasswordHashing.SALT;
import static Encryption.PasswordHashing.generateHashValue;

import MongoDatabase.MongoDBConnection;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.ErrorCategory;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoWriteException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.Date;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Lucas.L.H.H
 */
public class LoginModel {
    
    // Creating new object for database connection url
    MongoDBConnection mongoDB;

    public LoginModel() {
        // Creating new object to retrieve database connection url
        mongoDB = new MongoDBConnection();
    }
    
    // Declaring global variables to verigy the entered login credentials
    private String emailAddress;
    private String password;
    
    // Getter
    public String getEmailAddress(){
        return emailAddress;
    }
    
    public String getPassword(){
        return password;
    }
    
    // Setters
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    // Process of verifying the entered login credentials
    public String verifyLoginCredentials(){
    
        try{
            // Establishing MongoDB URI Connection
            MongoClientURI uri = new MongoClientURI(mongoDB.MongoDBConnectionURL());
            MongoClient mongoClient = new MongoClient(uri);

            // Connecting to the MongoDB database
            MongoDatabase database = mongoClient.getDatabase("CERdb");

            // Connecting to the MongoDB collection
            MongoCollection collection = database.getCollection("users");
            
            /* GENERATING SHA1 HASH PASSWORD VALUE WITH SALTING */
            // Salting entered password value
            String saltedPasswordValue = SALT + password;
            // Generating hash value of the salted password
            String hashedPasswordValue = generateHashValue(saltedPasswordValue);
            
            // Retrieving the document with the entered email address and generated hash value of the entered password
            Document userDocument = (Document) collection.find(Filters.eq("emailAddress", emailAddress)).first();
            
            // Checking if a document from the database was returned
            if(userDocument != null){
                // A document was returned
                // Converting the retrieved value to JSON format and converting the JSON value to a JSON object
                JSONObject documentJSONObject = new JSONObject(userDocument.toJson());
                
                String hashedPasswordValueDB = documentJSONObject.getString("passwordHash");
                String userType = documentJSONObject.getString("userType");
                
                // Checking of the hash password value in the database is the same as the generated 
                // hash password from the user entered password
                if(hashedPasswordValue.equals(hashedPasswordValueDB)){
                    // Password is same
                    System.out.println("fffff: "+userType);
                    if("customer".equals(userType) || "attorney".equals(userType)){
                        return "Document Found - Correct Password - Customer - Attorney";
                    }
                    else if("officer".equals(userType)){
                        return "Document Found - Correct Password - Officer";
                    }
                    else if("admin".equals(userType)){
                        return "Document Found - Correct Password - Admin";
                    }
                }
                else if(!hashedPasswordValue.equals(hashedPasswordValueDB)){
                    // Password is not the same
                    return "Document Found - Wrong Password";
                }    
            }
            else if(userDocument == null){
                // No document was returned
                return "Document Not Found";
            }     
        }
        catch (JSONException ex) {
            System.out.println("ERROR: " + ex);
        }

        return "";
    }
    
}
