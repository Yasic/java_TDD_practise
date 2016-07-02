package com.tw.tdd1.Javabean;

import com.tw.tdd1.Exception.InchLessThanZeroException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yasic on 16-7-2.
 */
public class InchTest {
    @Test
    public void shouldNullNotEqualOneInch() throws Exception {
        Assert.assertNotEquals(null, new Inch(1));
    }

    @Test
    public void shouldOneInchEqualToOneInch() throws Exception {
        Assert.assertEquals(new Inch(1), new Inch(1));
    }

    @Test
    public void shouldOneInchNotEqualToTwoInch() throws Exception{
        Assert.assertNotEquals(new Inch(1), new Inch(2));
    }

    @Test
    public void shouldOneInchNotEqualToNull() throws Exception{
        Assert.assertNotEquals(new Inch(1), null);
    }

    @Test(expected = InchLessThanZeroException.class)
    public void shouldThrowExceptionWhenInchLessThanZero() throws Exception{
        Inch test1 = new Inch(-1);
    }

    @Test
    public void shouldOneInchNotEqualToOneFeet() throws Exception {
        Assert.assertNotEquals(new Inch(1), new Feet(1));
    }

    @Test
    public void shouldTwelveInchEqualToOneFeet() throws Exception {
        Assert.assertEquals(new Inch(12), new Feet(1));
    }

    @Test
    public void shouldThirteenInchNotEqualToOneFeet() throws Exception {
        Assert.assertNotEquals(new Inch(13), new Feet(1));
    }

    @Test
    public void shouldOneInchNotEqualToOneInteger() throws Exception{
        Assert.assertNotEquals(new Inch(1), 1);
    }

}
