package com.example.project;

/**
 * CarriageBolt
 */
public class CarriageBolt extends Bolt {

    public CarriageBolt(double length, String thread, String material, String finish, double price, int numberPerUnit)
            throws IllegalFastener {
        super(length, thread, material, finish, price, numberPerUnit);
    }

    @Override
    public String toString() {
        return "Carriage Bolt, " + super.toString();
    }
}