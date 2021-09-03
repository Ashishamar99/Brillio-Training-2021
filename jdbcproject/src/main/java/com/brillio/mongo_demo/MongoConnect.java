package com.brillio.mongo_demo;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class MongoConnect {
    public static DB getDB() throws Exception{
        MongoClient client = new MongoClient("localhost", 27017);
        DB db = client.getDB("brillio");
        return db;
    }

    public static boolean createCollection(DB db, String collectionName) throws Exception{
        db.createCollection(collectionName, null);
        return true;
    }
}
