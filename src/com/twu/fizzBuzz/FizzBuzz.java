package com.twu.fizzBuzz;

public class FizzBuzz {
    public static void main(String[] args) {

        System.out.println("FizzBuzz");
        countTo(5);

    }

    public static int countTo(int numberMax) {
        int counter = 0;
        Printer printer = new Printer();

        for (int position = 1; position <= numberMax ; position++) {
            printer.print(Integer.toString(position));
            counter++;
        }
        return counter;
    }
}
