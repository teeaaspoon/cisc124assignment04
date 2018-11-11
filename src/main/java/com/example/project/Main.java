package com.example.project;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Main
 */
public class Main {
    public static ArrayList<Fastener> db;

    public static void oneTimeTearDownAfterClass() throws Exception {

        String dbFile = "yeaheh.dat";
        File dbFileObject = new File(dbFile);
        if (dbFileObject.exists())
            dbFileObject.delete();
        db.trimToSize();
        // Using a lambda function here:
        db.sort((Fastener f1, Fastener f2) -> f1.toString().compareToIgnoreCase(f2.toString()));
        for (Fastener item : db)
            System.out.println(item);
        // Save the ArrayList so it can be used by the order system class.
        try (ObjectOutputStream binFileOut = new ObjectOutputStream(new FileOutputStream(dbFile))) {
            binFileOut.writeObject(db);
        }
    } // end oneTimeTearDownAfterClass method

    public static void main(String[] args) throws IllegalFastener, Exception {
        db = new ArrayList<>();

        CommonNail toAddTwo = new CommonNail("16D", 3.5, 8.0, "Bright", 174.29, 2450);
        System.out.println("created");
        db.add(toAddTwo);
        CommonNail toAddThree = new CommonNail("10D", 3.0, 9.0, "Bright", 21.69, 345);
        db.add(toAddThree);
        CommonNail toAddFour = new CommonNail("60D", 6.0, 2.0, "Bright", 153.29, 550);
        db.add(toAddFour);
        oneTimeTearDownAfterClass();

    }
}