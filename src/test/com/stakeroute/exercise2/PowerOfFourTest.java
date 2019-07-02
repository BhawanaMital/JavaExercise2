package com.stakeroute.exercise2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourTest {
   PowerOfFour powerOfFour;
    @Before
    public void setUp() throws Exception {
       powerOfFour=new PowerOfFour();
    }

    @After
    public void tearDown() throws Exception {
       powerOfFour=null;
    }

    @Test
    public void returnPowerOfFour() {
        String result=powerOfFour.isPowerOfFour(16);
        assertEquals("Power of 64",result);
    }

    @Test
    public void returnNotPowerOfFour() {
        String result=powerOfFour.isPowerOfFour(60);
        assertEquals("Not a power of 64",result);
    }

    @Test
    public void returnZero() {
        String result=powerOfFour.isPowerOfFour(0);
        assertEquals("Number is zero",result);
    }
}