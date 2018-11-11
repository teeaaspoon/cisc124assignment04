package com.example.project;

/**
 * WingNut
 */
public class WingNut extends ThreadedFastener {

    public WingNut(String thread, String material, String finish, double price, int numberPerUnit)
            throws IllegalFastener {
        super(thread, material, finish, price, numberPerUnit);
    }

    @Override
    public String toString() {
        return "Wing Nut, " + super.toString();
    }

}