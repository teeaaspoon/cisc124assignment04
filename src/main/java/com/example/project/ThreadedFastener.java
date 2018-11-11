package com.example.project;

/**
 * ThreadedFastener
 */
public abstract class ThreadedFastener extends Fastener {
    private String thread;

    public ThreadedFastener(String thread, String material, String finish, double price, int numberPerUnit)
            throws IllegalFastener {
        super(material, finish, price, numberPerUnit);
        setThread(thread);
    }

    public void setThread(String thread) throws IllegalFastener {
        if (thread.equals("#8-13") || thread.equals("#8-15") || thread.equals("#8-32") || thread.equals("#10-13")
                || thread.equals("#10-24") || thread.equals("#10-32") || thread.equals("1/4-20")
                || thread.equals("5/16-18") || thread.equals("3/8-16") || thread.equals("7/16-14")
                || thread.equals("1/2-13") || thread.equals("5/8-11") || thread.equals("3/4-10")) {
            this.thread = thread;
        } else {
            throw new IllegalFastener("Illegal thread / diameter size: " + thread);
        }
    }

    @Override
    public String toString() {
        return thread + " thread, " + super.toString();
    }
}