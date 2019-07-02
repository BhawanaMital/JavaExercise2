package com.stakeroute.exercise2;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.*;

public class CountFrequencyWordTest {

    CountFrequencyWord wordFrequency;


    @Before
    public void setUp() throws Exception {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        wordFrequency = new CountFrequencyWord();
    }

    @After
    public void tearDown() throws Exception {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        wordFrequency = null;

    }

    @Test
    public void testFrequencyOfWords() throws IOException {



        String expexted = "i - 3,\n" +
                "am - 1,\n" +
                "like - 1,\n" +
                "have - 1,\n" +
                "a - 2,\n" +
                "to - 1,\n" +
                "man - 1,\n" +
                "sleep - 1,\n" +
                "home - 1";


        String actual= wordFrequency.readText( "/home/bhawana/Desktop/exercise2/DemoText.txt");
        assertEquals(expexted,actual);
    }

    @Test
    public void testFrequencyOfWordsFailure() throws IOException{
        String actual= wordFrequency.readText( "/home/bhawana/Desktop/exercise2/DemoText.txt");
        String expexted = "i - 3,\n" +
                "am - 1,\n" +
                "like - 1,\n" +
                "have - 1,\n" +
                "a - 2,\n" +
                "to - 1,\n" +
                "man - 1,\n" +
                "sleep - 1,\n" +
                "home - 1";

        assertNotNull(expexted,actual);
    }
}