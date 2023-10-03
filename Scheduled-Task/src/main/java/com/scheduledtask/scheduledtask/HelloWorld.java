package com.scheduledtask.scheduledtask;

import java.util.Timer;
import java.util.TimerTask;

public class HelloWorld {
    public static void main(String[] args) {
        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        }, 0, 2000);
    }
}
