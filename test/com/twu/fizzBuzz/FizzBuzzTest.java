package com.twu.fizzBuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void countsFromOneToMaxNumber(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int countToHundred = fizzBuzz.countTo(100);
        Assert.assertEquals(countToHundred, 100);
    }

}
