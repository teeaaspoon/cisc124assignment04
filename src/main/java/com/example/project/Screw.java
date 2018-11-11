package com.example.project;

/**
 * Screw
 */
public abstract class Screw extends ThreadedFastenerWithLength {
    private String head;
    private String drive;

    public Screw(double length, String thread, String material, String finish, String head, String drive, double price,
            int numberOfUnits) throws IllegalFastener {
        super(length, thread, material, finish, price, numberOfUnits);
        setHead(head);
        setDrive(drive);
    }

    public void setHead(String head) throws IllegalFastener {
        if (head.equals("Bugle") || head.equals("Flat") || head.equals("Oval") || head.equals("Pan")
                || head.equals("Round")) {
            this.head = head;
        } else {
            throw new IllegalFastener("Illegal head: " + head);
        }
    }

    public void setDrive(String drive) throws IllegalFastener {
        if (drive.equals("6-Lobe") || drive.equals("Philips") || drive.equals("Slotted") || drive.equals("Square")) {
            this.drive = drive;
        } else {
            throw new IllegalFastener("Illegal drive: " + drive);
        }
    }

    // if a screw is instantiated, the Fastener class will use this validateFinish
    // instead of it's own
    @Override
    public boolean validateFinish(String finish, String material) {
        if ((finish.equals("Chrome") || finish.equals("Hot Dipped Galvanized") || finish.equals("Plain")
                || finish.equals("Yellow Zinc") || finish.equals("Zinc") || finish.equals("Black Phosphate")
                || finish.equals("ACQ 1000 Hour") || finish.equals("Lubricated")) && material.equals("Steel")) {
            return true;
        } else {
            System.out.println("super called");
            return super.validateFinish(finish, material);
        }
    }

    @Override
    public String toString() {
        return head + " head, " + drive + " drive, " + super.toString();
    }
}