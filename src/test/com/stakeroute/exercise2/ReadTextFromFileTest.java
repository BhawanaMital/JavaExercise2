package com.stakeroute.exercise2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ReadTextFromFileTest {
    ReadTextFromFile readTextFromFile;
    @Before
    public void setUp() throws Exception {
        readTextFromFile=new ReadTextFromFile();

    }

    @After
    public void tearDown() throws Exception {
        readTextFromFile=null;
    }

    @Test
    public void returnFileText() throws IOException {

    String actual=readTextFromFile.readText("/home/bhawana/Desktop/exercise2","txt");
    assertEquals("Java PE2.pdf\n" +
                    "out\n" +
                    "DemoText.txt\n" +
                    "i am a man ,\n" +
                    "i like to sleep ,\n" +
                    "i have a home.\n" +
                    "\n" +
                    ".idea\n" +
                    "exercise2.iml\n" +
                    "src\n"
,actual);
    }
}


