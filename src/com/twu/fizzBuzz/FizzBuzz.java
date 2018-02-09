package com.twu.fizzBuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.print("FizzBuzz");
        countTo(5);

    }

    public static int countTo(int numberMax) {
        Printer printer = new Printer();
        int counter = 0;

        for (int position = 1; position <= numberMax ; position++) {
            printer.print(Integer.toString(position));
            counter++;
        }
        return counter;
    }

    // funcao traducao
}
