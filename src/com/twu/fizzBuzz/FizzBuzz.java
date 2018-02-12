package com.twu.fizzBuzz;

public class FizzBuzz {

    private Printer printer;

    public FizzBuzz(Printer printer) {
        this.printer = printer;
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        int counter = 0;

        for (int position = 1; position <= numberMax ; position++) {
            printer.print(Integer.toString(position));
            counter++;
        }
        return counter;
    }

    public String classification(int number) {
        return "Is a number";

    }

    // funcao traducao
}
