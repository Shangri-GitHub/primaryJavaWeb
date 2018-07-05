package com.controller.clock;

public class Display {
    private int uplimit;
    private int value = 0;
    private String val;


    public Display(int uplimit) {
        this.uplimit = uplimit;
    }

    public void tick() {
        value++;
        if (uplimit == value) {
            value = 0;
        }
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        if (value < 10) {
            val = "0" + value;
        } else {
            val = "" + value;
        }
        return val;
    }

    public static void main(String[] args) {
        Display d = new Display(24);
        while (true) {
            d.tick();
            System.out.println(d);
        }

    }
}
