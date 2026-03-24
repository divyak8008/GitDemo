package com.example.helloworld;

public class Main {
    public static void main(String[] args) {
    	System.out.println("Hello, Eclipse!");

        // Simple loop example
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        // Simple method call
        greet("User");
    }

    public static void greet(String name) {
        System.out.println("Welcome, " + name + "!");
    }
}