package com.stakeroute.exercise2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ReadFileUpperTest {

    ReadFileUpper ob;

    @Before
    public void setUp() throws Exception {
        ob=new ReadFileUpper();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void readFileFromDirectory() throws IOException {
        String result=ob.readFile("/home/bhawana/Desktop/exercise2/file.txt");

        assertEquals("IAMBHAWANA\nTHE LENGTH IS 11",result);


    }
}