package com.example;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import java.net.UnknownHostException;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        try {
            Mongo mongo = new Mongo("127.0.0.1");
            DB db = mongo.getDB("test_database");
            DBCollection dbCollection = db.getCollection("test_collection");

            BasicDBObject basicDBObject = new BasicDBObject();
            basicDBObject.put("random", new Random().nextInt(1000));

            dbCollection.insert(basicDBObject);

            System.out.println("document have been inserted");

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }

}
