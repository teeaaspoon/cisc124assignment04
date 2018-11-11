package com.example.project;

/**
 * ThreadedFastenerWithLength
 */
public abstract class ThreadedFastenerWithLength extends ThreadedFastener {
    private double length;

    public ThreadedFastenerWithLength(double length, String thread, String material, String finish, double price,
            int numberPerUnit) throws IllegalFastener {
        super(thread, material, finish, price, numberPerUnit);
        setLength(length);
    }

    // sets the length and does validation for legal lengths
    public void setLength(double length) throws IllegalFastener {
        String lengthString = Double.toString(length);
        boolean valid = false;
        if (length >= 0.5 && length <= 6.0) {
            // check for increments of 0.25 inches
            if (lengthString.contains(".0") || lengthString.contains(".25") || lengthString.contains(".5")
                    || lengthString.contains(".75")) {
                this.length = length;
                valid = true;
            }
        } else if (length >= 6.0 && length <= 11.0) {
            // check for increments of 0.5 inches
            if (lengthString.contains(".0") || lengthString.contains(".5")) {
                this.length = length;
                valid = true;
            }
        } else if (length >= 11.0 && length <= 20.0) {
            if (lengthString.contains(".0")) {
                this.length = length;
                valid = true;
            }
        }
        // if the length was not valid throw error
        if (!valid) {
            throw new IllegalFastener("Illegal length: " + length);
        }
    }

    @Override
    public String toString() {
        return length + "\" long, " + super.toString();
    }

}