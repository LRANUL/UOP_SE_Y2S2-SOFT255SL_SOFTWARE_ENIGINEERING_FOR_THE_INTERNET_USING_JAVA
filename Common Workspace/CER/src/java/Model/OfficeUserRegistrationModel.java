/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/* 
    Imports used for password salting and hashing, 
    creating new objects is not necessary for these as this variable and method is static.
*/
import static Encryption.PasswordHashing.SALT;
import static Encryption.PasswordHashing.generateHashValue;

import MongoDatabase.MongoDBConnection;
import com.mongodb.ErrorCategory;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoWriteException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import org.bson.Document;

/**
 *
 * @author Lucas.L.H.H
 */
public class OfficeUserRegistrationModel {
    
    // Creating new object for database connection url
    MongoDBConnection mongoDB;

    public OfficeUserRegistrationModel() {
        // Creating new object to retrieve database connection url
        mongoDB = new MongoDBConnection();
    }
    
    // Declaring global variables used for office user registration
    private String prefixName = null;
    private String firstName = null;
    private String middleName = null;
    private String lastName = null;
    private String nicNumber = null;
    private String cerId = null;
    private String cerEmailAddress = null;
    private String reenterPassword = null;

    // GETTERS
    public String getPrefixName() {
        return prefixName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getMiddleName() {
        return middleName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getNICNumber() {
        return nicNumber;
    }
    
    public String getCERId() {
        return cerId;
    }
    
    public String getCEREmailAddress() {
        return cerEmailAddress;
    }
    
    public String getReenterPassword() {
        return reenterPassword;
    }
    
    // SETTERS
    public void setPrefixName(String prefixName) {
        this.prefixName = prefixName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNICNumber(String nicNumber) {
        this.nicNumber = nicNumber;
    }
    
    public void setCERId(String cerId) {
        this.cerId = cerId;
    }
    
    public void setCEREmailAddress(String cerEmailAddress) {
        this.cerEmailAddress = cerEmailAddress;
    }
    
    public void setReenterPassword(String reenterPassword) {
        this.reenterPassword = reenterPassword;
    }
    
    /* PROCESS OF REGISTERING A NEW OFFICE USER */
    public Boolean newOfficeUserRegistration() {
        /* PROCESS OF INSERTING USER ENTERED VALUES INTO THE MONGODB */
        try{
            // Establishing MongoDB URI Connection
            MongoClientURI uri = new MongoClientURI(mongoDB.MongoDBConnectionURL());
            MongoClient mongoClient = new MongoClient(uri);

            // Connecting to the MongoDB database
            MongoDatabase database = mongoClient.getDatabase("CERdb");

            // Connecting to the MongoDB collection
            MongoCollection collection = database.getCollection("users");
            
            
            /* PROCESS OF IDENTIFYING NEW DOCUMENT ID */
            // Retrieving the latest inserted document
            Document latestDocument = (Document) collection.find().sort(new Document("_id", -1)).first();
            // Declaring variable to store the latest document id
            int latestDocumentID = 0;
            // Checking if there is a document existing in the collection
            if (latestDocument == null) {
                // If there is no document latestDocumentID is set to initial value, zero
                latestDocumentID = 0;
            } else if (latestDocument != null) {
                // If there is a latest document, it's id will be retrieved and assgined to the latestDcouemntID variable
                latestDocumentID = (int) latestDocument.get("_id");
            }
            // Incrementing latest document id by one to identify the new document id
            int newDocumentID = ++latestDocumentID;
            
            
            /* GENERATING SHA1 HASH PASSWORD VALUE WITH SALTING */
            // Salting entered password value
            String saltedPasswordValue = SALT + reenterPassword;
            // Generating hash value of the salted password
            String hashedPasswordValue = generateHashValue(saltedPasswordValue);
            
            
            // Creating a new document to store in the MongoDB collection
            Document newDocument = new Document();

            // Inserting relevant data into the document
            newDocument.append("_id", newDocumentID)
                    .append("userType", "officer")
                    .append("cerID", cerId)
                    .append("emailAddress", cerEmailAddress)                    
                    .append("passwordHash", hashedPasswordValue)                    
                    .append("nic", nicNumber)
                    .append("name",
                            new Document("prefix", prefixName)
                                    .append("firstName", firstName)
                                    .append("middleName", middleName)
                                    .append("lastName", lastName))
                    .append("registrationDateTime", new Date())
                    .append("sessionActivity",
                            new Document("loginDateTime", "")
                                    .append("logoutDateTime", ""))
                    .append("accountStatus", "Active");
            
            // Inserting the created document into the MongoDB collection
            try {
                collection.insertOne(newDocument);
                return true;
            } 
            catch (MongoWriteException ex) {
                // Checking if the newly created document ID is already existing error is returned
                if (ex.getError().getCategory().equals(ErrorCategory.DUPLICATE_KEY)) {
                    System.out.println("\nNewly Created Document ID Already Exists in the Collection");
                }
                return false;
            }
        }
        catch (Exception ex) {
            System.out.println("ERROR: " + ex);
            return false;
        }
        
    }
    
}
