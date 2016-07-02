package com.tw.tdd1.Javabean;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by yasic on 16-7-2.
 */
public class FeetTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getData() throws Exception {

    }

    @Test
    public void shouldOneFeetNotEqualToNull() throws Exception {
        Assert.assertNotEquals(new Feet(1), null);
    }

    @Test
    public void shouldOneFeetEqualToOneFeet() throws Exception {
        Assert.assertEquals(new Feet(1), new Feet(1));
    }

    @Test
    public void shouldOneFeetNotEqualToTwoFeet() throws Exception {
        Assert.assertNotEquals(new Feet(1), new Feet(2));
    }

    @Test
    public void shouldOneFeetNotEqualOneInch() throws Exception {
        Assert.assertNotEquals(new Feet(1), new Inch(1));
    }

    @Test
    public void shouldOneFeetEqualTwelveInch() throws Exception {
        Assert.assertEquals(new Feet(1), new Inch(12));
    }

    @Test
    public void shouldOneFeetEqualThirteenInch() throws Exception {
        Assert.assertNotEquals(new Feet(1), new Inch(13));
    }
}