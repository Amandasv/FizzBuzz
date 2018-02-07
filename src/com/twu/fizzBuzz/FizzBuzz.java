package com.twu.fizzBuzz;

public class FizzBuzz {
    public static void main(String[] args) {

        System.out.println("test");
        countTo(5);

    }

    public static int countTo(int numberMax) {
        int counter = 0;
        int position = 0;

        for (position = 1; position <= numberMax ; position++) {
            System.out.println(position);
            counter++;
        }
        return counter;
    }
}
