package com.stakeroute.exercise2;

import main.com.stakeroute.exercise2.EvenNumber;
import org.junit.Test;

import static org.junit.Assert.*;


public class EvenNumberTest {
    EvenNumber evenNumber;
    @org.junit.Before
    public void setUp() throws Exception {
        evenNumber=new EvenNumber();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        evenNumber=null;
    }
    @Test
    public  void returnTrueEven(){
        Boolean result=evenNumber.isEven(32);
        assertEquals(true,result);
    }


    @Test
    public  void returnFalseEven(){
        Boolean result=evenNumber.isEven(77);
        assertEquals(false,result);
    }

}