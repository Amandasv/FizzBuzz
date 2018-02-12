package com.twu.fizzBuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz(new Printer());

    @Test
    public void returnsFizzIfNumberIsDivisibleByThree() {
        String message = fizzBuzz.classification(3);

        Assert.assertEquals("Fizz", message);
    }

    @Test
    public void returnsBuzzIfNumberIsDivisibleByFive() {
        String message = fizzBuzz.classification(5);

        Assert.assertEquals("Buzz", message);
    }

    @Test
    public void returnsFizzBuzzIfNumberIsDivisibleByFiveAndThree() {
        String message = fizzBuzz.classification(15);

        Assert.assertEquals("FizzBuzz", message);
    }

    @Test
    public void returnsNumberIfNumberIsNotDivisibleByFiveOrThree() {
        String message = fizzBuzz.classification(1);

        Assert.assertEquals("1", message);
    }

}
