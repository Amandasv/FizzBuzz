package com.twu.fizzBuzz;

public class FizzBuzz {

    private Printer printer;

    public FizzBuzz(Printer printer) {
        this.printer = printer;
    }

    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.print("FizzBuzz Exercise \n\n");
        FizzBuzz fizzBuzz = new FizzBuzz(printer);

        fizzBuzz.generate(100);

    }

    public void generate(int numberMax) {
        for (int position = 1; position <= numberMax ; position++) {
            printer.print(classification(position) + "\n");
        }
    }

    public String classification(int number) {
        return "Is a number";

    }

    // funcao traducao
}
