/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import MongoDatabase.MongoDBConnection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import java.util.List;

/**
 *
 * @author Lucas.L.H.H
 */
public class MemberRegistrationModel {
    
    // Creating new object for database connection url
    MongoDBConnection mongoDB;

    public MemberRegistrationModel(){
        
        // Creating new object to retrieve database connection url
        mongoDB = new MongoDBConnection();
        
    }
    
    private String prefixName = null;
    private String firstName = null;
    private String middleName = null;
    private String lastName = null;
    private String nic = null;
    private String dateOfBirth = null;
    private String streetAddress = null;
    private String city = null;
    private String district = null;
    private String zipPostalCode = null;
    private String nicPassportImage = null;
    private String emailAddress = null;
    private String confirmPassword = null;
    
    // GETTERS
    public String getPrefixName(){
        return prefixName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getMiddleName(){
        return middleName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getNIC(){
        return nic;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public String getStreetAddress(){
        return streetAddress;
    }
    public String getCity(){
        return city;
    }
    public String getDistrict(){
        return district;
    }
    public String getZipPostalCode(){
        return zipPostalCode;
    } 
    public String getNICPassportImage(){
        return nicPassportImage;
    }
    public String getEmailAddress(){
        return emailAddress;
    }
    public String getConfirmPassword(){
        return confirmPassword;
    }
    
    // SETTERS
    public void setPrefixName(String prefixName){
        this.prefixName = prefixName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setNIC(String nic){
        this.nic = nic;
    }
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public void setStreetAddress(String streetAddress){
        this.streetAddress = streetAddress;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setDistrict(String district){
        this.district = district;
    }
    public void setZipPostalCode(String zipPostalCode){
        this.zipPostalCode = zipPostalCode;
    }
    public void setNICPassportImage(String nicPassportImage){
        this.nicPassportImage = nicPassportImage;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    public void setConfirmPassword(String confirmPassword){
        this.confirmPassword = confirmPassword;
    }
    
    public void newCustomerRegistration(){
       
        MongoClientURI uri = new MongoClientURI(mongoDB.MongoDBConnectionURL());
        
        MongoClient mongoClient = new MongoClient(uri);

        // Connecting to the database
        MongoDatabase database = mongoClient.getDatabase("myLibrary");
        System.out.println("Database Connection Successful");
        System.out.println("Database Name: " + database.getName());

        // To retrieve all database name
        List<String> dbNames = mongoClient.getDatabaseNames();
        System.out.println("\nAll Available Databases: " + dbNames);
        
    }
    

}
