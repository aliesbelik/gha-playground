package com.aliesbelik.sample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger log = LogManager.getLogger(App.class);

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        log.info("Hello World!");
    }
}
