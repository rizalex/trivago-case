package org.example;

public class Fishing {
    public String getBad() {
        return "There's no such thing as a bad day when you're fishing!";
    }

    public static void main(String[] args) {
        System.out.println(new Fishing().getBad());
    }
}
