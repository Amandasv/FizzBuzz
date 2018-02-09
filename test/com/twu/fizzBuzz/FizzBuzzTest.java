package com.twu.fizzBuzz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void countsFromOneToMaxNumber(){
        int countToHundred = fizzBuzz.countTo(100);
        Assert.assertEquals(countToHundred, 100);
    }

    @Test
    public void showThisClassification() {
        String classificationForNumber5 = fizzBuzz.classification(5);
        Assert.assertEquals(classificationForNumber5, fizzBuzz.classification(5));

    }

}
