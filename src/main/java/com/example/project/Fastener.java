package com.example.project;

import java.io.Serializable;

public abstract class Fastener implements Serializable {

    // supplies serial number for the .dat file generated from the test
    private static final long serialVersionUID = 3125965356358325431L;

    private String material;
    private String finish;
    private double unitPrice;
    private int numberPerUnit;

    public Fastener(String material, String finish, double unitPrice, int numberPerUnit) throws IllegalFastener {
        setMaterial(material);
        setFinish(finish);
        setUnitPrice(unitPrice);
        setNumberPerUnit(numberPerUnit);
    }

    private void setMaterial(String material) throws IllegalFastener {
        if (material.equals("Brass") || material.equals("Stainless Steel") || material.equals("Steel")) {
            this.material = material;
        } else {
            throw new IllegalFastener("Illegal material: " + material);
        }
    }

    private void setFinish(String finish) throws IllegalFastener {
        System.out.println("Starting setFinish");
        if (validateFinish(finish, material)) {
            this.finish = finish;
        } else {
            throw new IllegalFastener("Illegal finish: " + finish + " for material: " + material);
        }
    }

    private void setUnitPrice(double unitPrice) throws IllegalFastener {
        if (unitPrice > 0) {
            this.unitPrice = unitPrice;
        } else {
            throw new IllegalFastener("Illegal unit price: " + unitPrice);
        }
    }

    private void setNumberPerUnit(int numberPerUnit) throws IllegalFastener {
        if ((numberPerUnit == 1 || numberPerUnit % 5 == 0) && numberPerUnit >= 1) {
            this.numberPerUnit = numberPerUnit;
        } else {
            throw new IllegalFastener("Illegal nunmber per unit" + numberPerUnit);
        }
    }

    // validates the finish, Screw and CommonNail will override this method with
    // their own version if instantiated
    public boolean validateFinish(String finish, String material) {
        System.out.println("finish: " + finish + " material: " + material);
        if ((finish.equals("Chrome") || finish.equals("Hot Dipped Galvanized") || finish.equals("Plain")
                || finish.equals("Yellow Zinc") || finish.equals("Zinc")) && material.equals("Steel")) {
            return true;
        } else if (finish.equals("Plain") && (material.equals("Brass") || material.equals("Stainless Steel"))) {
            return true;
        } else {
            return false;
        }
    }

    // Accepts any number of units and returns what the cost would be
    public double getOrderCost(int numberOfUnits) {
        return unitPrice * numberPerUnit * numberOfUnits;
    }

    @Override
    public String toString() {
        return material + ", with a " + finish + " finish. " + numberPerUnit + " in a unit, $" + unitPrice
                + " per unit.";
    }
}