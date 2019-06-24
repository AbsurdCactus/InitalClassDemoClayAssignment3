package edu.bsu.cs222;

import org.junit.Assert;
import org.junit.Test;

public class LeapYearCalculatorTest {
    @Test
    public void test2004IsLeapYear(){
        LeapYearCalculator leapYear = new LeapYearCalculator();
        boolean result = leapYear.isLeapYear(2004);
        Assert.assertTrue(result);
    }


    @Test
    public void test2001IsLeapYear(){
        LeapYearCalculator leapyear = new LeapYearCalculator();
        boolean result = leapyear.isLeapYear(2001);
        Assert.assertFalse(result);
    }
}
