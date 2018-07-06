package com.controller.clock;



public class Clock {
    private Display hour = new Display(24);
    private Display minute = new Display(60);

    public void tick() {
        minute.tick();
        if (minute.getValue() == 0) {
            hour.tick();
        }
    }

    public void show() {
        System.out.println(hour + ":" + minute);
    }

    public static void main(String[] args) {



        Clock clock = new Clock();
        while (true) {
            clock.tick();
            clock.show();
        }

    }
}
