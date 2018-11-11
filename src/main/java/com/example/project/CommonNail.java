package com.example.project;

/**
 * CommonNail
 */
public class CommonNail extends Nail {

    String size;
    double length;
    double gauge;

    public CommonNail(String size, double length, double gauge, String finish, double price, int numberPerUnit)
            throws IllegalFastener {
        super(finish, price, numberPerUnit);
        setSize(size);
        setLength(length);
        setGauge(gauge);
    }

    private void setSize(String size) throws IllegalFastener {
        if (size.equals("6D") || size.equals("8D") || size.equals("10D") || size.equals("12D") || size.equals("16D")
                || size.equals("60D")) {
            this.size = size;
        } else {
            throw new IllegalFastener("Illegal size: " + size);
        }
    }

    private void setLength(double length) throws IllegalFastener {
        if (length == 2.0 || length == 2.5 || length == 3 || length == 3.25 || length == 3.5 || length == 6) {
            this.length = length;
        } else {
            throw new IllegalFastener("Illegal length: " + length);
        }
    }

    private void setGauge(double gauge) throws IllegalFastener {
        if (gauge == 2.0 || gauge == 8.0 || gauge == 9.0 || gauge == 10.25 || gauge == 11.5) {
            this.gauge = gauge;
        } else {
            throw new IllegalFastener("Illegal gauge: " + gauge);
        }
    }

    // if a CommonNail is instantiated, the Fastener class will use this
    // validateFinish instead of it's own
    @Override
    public boolean validateFinish(String finish, String material) {
        System.out.println(finish);
        System.out.println(material);
        if (finish.equals("Bright") || finish.equals("Hot Dipped Galvanized")) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Common Nail, " + size + " size, " + length + "\" long, " + gauge + " gauge, " + super.toString();
    }

}