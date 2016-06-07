package com.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Projections;
import org.w3c.dom.Document;

import java.util.logging.Filter;

/**
 * Created by kavita on 6/6/16.
 */
public class AppMongoConnection {

    public static void main(String[] args) {
        MongoClient mongoClient=new MongoClient("localhost",27017);
        MongoDatabase mongoDatabase=mongoClient.getDatabase("m101");
        MongoCollection<org.bson.Document> mongoCollection=mongoDatabase.getCollection("movies");
    }
}
