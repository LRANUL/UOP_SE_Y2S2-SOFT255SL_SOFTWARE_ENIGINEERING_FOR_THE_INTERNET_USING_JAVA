/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CER;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author ranul
 */
public class DB {
    public static void main(String[] args) {
        MongoClient mongoClient = MongoClients.create("mongodb+srv://admin:ffUBY4EbyKjjTgCk@cers-gk9br.mongodb.net/test?retryWrites=true&w=majority");
MongoDatabase database = mongoClient.getDatabase("test");
        System.out.println("Success!");
    }
}
