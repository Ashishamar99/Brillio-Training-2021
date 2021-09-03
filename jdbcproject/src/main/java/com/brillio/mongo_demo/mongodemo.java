package com.brillio.mongo_demo;

import com.mongodb.DB;
import com.mongodb.DBObject;

import java.util.List;

public class mongodemo {
    public static void main(String[] args) {
        MongoDAOB mongoDAOB = new MongoDAOB();
        try {
            DB db = MongoConnect.getDB();
            List<DBObject> ls = mongoDAOB.readData(db, "inventory");

            ls.forEach(System.out::println);

//            mongoDAOB.insertData(db, "inventory", new String[][]{{"_id", "colgate300"}, {"status", "B"}, {"qty", "100"}});

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
