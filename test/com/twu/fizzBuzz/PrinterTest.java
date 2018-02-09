package com.twu.fizzBuzz;

import org.junit.Assert;
import org.junit.Test;


public class PrinterTest {


    @Test
    public void printsMessagePassed(){
        Printer printer = new Printer();
        String words = "FizBuzz Test";
        printer.print(words);

        //need Assert

    }
}
