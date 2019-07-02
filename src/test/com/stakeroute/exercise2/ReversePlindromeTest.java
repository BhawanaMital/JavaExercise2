package com.stakeroute.exercise2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReversePlindromeTest {
    ReversePlindrome reversePlindrome;
    @Before
    public void setUp() throws Exception {
        reversePlindrome =new ReversePlindrome();
    }

    @After
    public void tearDown() throws Exception {
        reversePlindrome=null;
    }

    @Test
    public void returnPalindrome() {
        String result=reversePlindrome.CheckPalindrome(12521);
        assertEquals("palindrome number",result);
    }


    @Test
    public void returnNotPalindrome() {
        String result=reversePlindrome.CheckPalindrome(1252781);
        assertEquals("not palindrome",result);
    }
}