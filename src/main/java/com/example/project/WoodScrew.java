package com.example.project;

/**
 * WoodScrew
 */
public class WoodScrew extends Screw {

    private String point;

    public WoodScrew(double length, String thread, String material, String finish, String head, String drive,
            String point, double price, int numberPerUnit) throws IllegalFastener {
        super(length, thread, material, finish, head, drive, price, numberPerUnit);
        setPoint(point);
    }

    public void setPoint(String point) throws IllegalFastener {
        if (point.equals("Double Cut") || point.equals("Sharp") || point.equals("Type 17")) {
            this.point = point;
        } else {
            throw new IllegalFastener("Illegal point: " + point);
        }
    }

    @Override
    public String toString() {
        return "Wood Screw, " + point + " point, " + super.toString();
    }
}