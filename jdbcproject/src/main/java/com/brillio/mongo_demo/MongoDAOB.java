package com.brillio.mongo_demo;

import com.mongodb.*;

import java.util.List;

public class MongoDAOB {
    public List<DBObject> readData(DB db, String collectionName){
        DBCollection dbCollection = db.getCollection(collectionName);
        DBObject query = BasicDBObjectBuilder.start().get();
        DBCursor cursor = dbCollection.find(query);

        return cursor.toArray();
    }

    public void insertData(DB db, String collectionName, String[][] data) throws Exception{
        DBCollection dbCollection = db.getCollection(collectionName);

        //We will be taking data as a 2D Matrix and converting that using a document builder.
        BasicDBObjectBuilder dbBuilder = BasicDBObjectBuilder.start();

        for (int i = 0; i < data.length; i++) {
            dbBuilder.append(data[i][0], data[i][1]);
        }

        WriteResult rs = dbCollection.insert(dbBuilder.get());
        System.out.println(rs);
    }
}
