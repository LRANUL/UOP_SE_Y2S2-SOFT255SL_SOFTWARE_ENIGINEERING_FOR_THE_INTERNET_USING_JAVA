/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import MongoDatabase.MongoDBConnection;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.ErrorCategory;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoWriteException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSInputFile;
import java.io.File;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import static java.util.stream.DoubleStream.iterate;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import javax.ws.rs.core.Context;
import static jdk.nashorn.internal.objects.NativeError.getFileName;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.bson.Document;

/**
 *
 * @author Lucas.L.H.H
 */
public class MemberRegistrationModel {

    // Creating new object for database connection url
    MongoDBConnection mongoDB;

    public MemberRegistrationModel() {
        // Creating new object to retrieve database connection url
        mongoDB = new MongoDBConnection();
    }

    // Declaring global variables used for customer and attorney registration
    private String prefixName = null;
    private String firstName = null;
    private String middleName = null;
    private String lastName = null;
    private String nic = null;
    private String streetAddress = null;
    private String city = null;
    private String district = null;
    private String zipPostalCode = null;
    private String emailAddress = null;
    private String confirmPassword = null;

    // Declaring global variables used for customer registration
    private String dateOfBirth = null;
    private Part  nicPassportImage = null;

    // Declaring global variables used for attorney registration
    private String attorneyId = null;
    private Part attorneyIdImage = null;

    // Assigning SALT value for salting user entered password value
    public static final String SALT = "SOFT255SL - CERWebApp";

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

    public String getNIC() {
        return nic;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getDistrict() {
        return district;
    }

    public String getZipPostalCode() {
        return zipPostalCode;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public Part getNICPassportImage() {
        return nicPassportImage;
    }

    public String getAttorneyId() {
        return attorneyId;
    }

    public Part getAttorneyIdImage() {
        return attorneyIdImage;
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

    public void setNIC(String nic) {
        this.nic = nic;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setZipPostalCode(String zipPostalCode) {
        this.zipPostalCode = zipPostalCode;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setNICPassportImage(Part nicPassportImage) {
        this.nicPassportImage = nicPassportImage;
    }

    public void setAttorneyId(String attorneyId) {
        this.attorneyId = attorneyId;
    }

    public void setAttorneyIdImage(Part attorneyIdImage) {
        this.attorneyIdImage = attorneyIdImage;
    }
    //@Context
    //HttpServletRequest request;

    /* PROCESS OF REGISTERING A NEW CUSTOMER USER */
    public Boolean newCustomerRegistration() {
        /* PROCESS OF INSERTING USER ENTETED VALUES INTO THE MONGODB DATABASE */
        try {
            // Establishing MongoDB URI Connection
            MongoClientURI uri = new MongoClientURI(mongoDB.MongoDBConnectionURL());
            MongoClient mongoClient = new MongoClient(uri);

            // Connecting to the MongoDB database
            MongoDatabase database = mongoClient.getDatabase("CERdb");

            // Connecting to the MongoDB collection
            MongoCollection collection = database.getCollection("users");
            
            
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
            String saltedPasswordValue = SALT + confirmPassword;
            // Generating hash value of the salted password
            String hashedPasswordValue = generateHashValue(saltedPasswordValue);
            
            
            /*
            // UPLOADING USER IMAGE TO THE DATABASE 
            DB db = mongoClient.getDB("CERAssetsDB");
            System.out.println("1");
            File imageFile = new File(nicPassportImage);
            System.out.println("2");
            System.out.println("Image: " + imageFile);
            System.out.println("3");
            System.out.println("Path: " + imageFile.getPath());
            System.out.println("4");
            System.out.println("Absolute path:" + imageFile.getAbsolutePath());
            System.out.println("5");
            String newImageFileName = "nicPassportImageTest";
            System.out.println("6");
            GridFS gfsPhoto = new GridFS(db, "photo");
            System.out.println("7");
            GridFSInputFile gfsFile = gfsPhoto.createFile(imageFile);
            System.out.println("8");
            gfsFile.setFilename(newImageFileName);
            System.out.println("9");            
            System.out.println("mm: "+gfsFile);
            gfsFile.save();
            System.out.println("10");
            */
            
            
            // Creating a new document to store in the MongoDB collection
            Document newDocument = new Document();
            // Inserting relevant data into the document
            newDocument.append("_id", newDocumentID)
                    .append("userType", "customer")
                    .append("emailAddress", emailAddress)                    
                    .append("passwordHash", hashedPasswordValue)                    
                    .append("nic", nic)                    
                    .append("name", 
                            new Document("prefix", prefixName)
                                    .append("firstName", firstName)
                                    .append("middleName", middleName)
                                    .append("lastName", lastName))
                    .append("dateOfBirth", dateOfBirth)
                    .append("address",
                            new Document("streetAddress", streetAddress)
                                    .append("city", city)
                                    .append("zipPostalCode", zipPostalCode)
                                    .append("district", district))
                    .append("proofOfCitizenship_fileName", "")
                    .append("registration",
                            new Document("userRequestDateTime", new Date())
                                    .append("officerResponseDateTime", "")
                                    .append("status", "Pending"))
                    .append("sessionActivity",
                            new Document("loginDateTime", "")
                                    .append("logoutDateTime", ""));

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

    /* PROCESS OF REGISTERING A NEW ATTORNEY USER */
    public Boolean newAttorneyRegistration() {
        /* PROCESS OF INSERTING USER ENTETED VALUES INTO THE MONGODB DATABASE */
        try {
            // Establishing MongoDB URI Connection
            MongoClientURI uri = new MongoClientURI(mongoDB.MongoDBConnectionURL());
            MongoClient mongoClient = new MongoClient(uri);

            // Connecting to the MongoDB database
            MongoDatabase database = mongoClient.getDatabase("CERdb");

            // Connecting to the MongoDB collection
            MongoCollection collection = database.getCollection("users");
            
            
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
            String saltedPasswordValue = SALT + confirmPassword;
            // Generating hash value of the salted password
            String hashedPasswordValue = generateHashValue(saltedPasswordValue);

            
            /*
            // UPLOADING USER IMAGE TO THE DATABASE 
            DB db = mongoClient.getDB("CERAssetsDB");
            File imageFile = new File(nicPassportImage);
            System.out.println("Image: "+imageFile);
            System.out.println("Path: "+ imageFile.getPath()); 
            System.out.println("Absolute path:" + imageFile.getAbsolutePath()); 
            String newImageFileName = "attorneyIdImageTest";
            GridFS gfsPhoto = new GridFS(db, "photo");
            GridFSInputFile gfsFile = gfsPhoto.createFile(imageFile);
            gfsFile.setFilename(newImageFileName);
            gfsFile.save();
             */
            
            // Creating a new document to store in the MongoDB collection
            Document newDocument = new Document();

            // Inserting relevant data into the document
            newDocument.append("_id", newDocumentID)
                    .append("userType", "attorney")
                    .append("emailAddress", emailAddress)                    
                    .append("passwordHash", hashedPasswordValue)                    
                    .append("nic", nic)  
                    .append("attorneyId", attorneyId)
                    .append("name",
                            new Document("prefix", prefixName)
                                    .append("firstName", firstName)
                                    .append("middleName", middleName)
                                    .append("lastName", lastName))
                    .append("address",
                            new Document("streetAddress", streetAddress)
                                    .append("city", city)
                                    .append("zipPostalCode", zipPostalCode)
                                    .append("district", district))
                    .append("attorneyIdValidity_fileName", "")
                    .append("registration",
                            new Document("userRequestDateTime", new Date())
                                    .append("officerResponseDateTime", "")
                                    .append("status", "Pending"))
                    .append("sessionActivity",
                            new Document("loginDateTime", "")
                                    .append("logoutDateTime", ""));

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

    /* PROCESS OF GENERATING SHA1 HASH VALUE OF PASSWORD */
    public static String generateHashValue(String passwordValue) {
        StringBuilder hashValue = new StringBuilder();

        try {
            MessageDigest sha = MessageDigest.getInstance("SHA-1");
            byte[] hashedValueBytes = sha.digest(passwordValue.getBytes());
            char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'a', 'b', 'c', 'd', 'e', 'f'};
            for (int x = 0; x < hashedValueBytes.length; ++x) {
                byte b = hashedValueBytes[x];
                hashValue.append(digits[(b & 0xf0) >> 4]);
                hashValue.append(digits[b & 0x0f]);
            }
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("ERROR: " + ex);
        }
        return hashValue.toString();
    }

}
