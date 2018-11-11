package com.example.project;

/**
 * Nail
 */
public abstract class Nail extends Fastener {

    public Nail(String finish, double price, int numberPerUnit) throws IllegalFastener {
        super("Steel", finish, price, numberPerUnit);
    }
}