package com.example.project;

/**
 * Bolt
 */
public abstract class Bolt extends ThreadedFastenerWithLength {
    public Bolt(double length, String thread, String material, String finish, double price, int numberPerUnit)
            throws IllegalFastener {
        super(length, thread, material, finish, price, numberPerUnit);
    }
}