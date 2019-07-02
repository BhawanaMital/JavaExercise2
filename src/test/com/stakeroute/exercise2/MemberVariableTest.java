package com.stakeroute.exercise2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {
    MemberVariable memberVariable;

    @Before
    public void setUp() throws Exception {
        memberVariable=new MemberVariable();
    }

    @After
    public void tearDown() throws Exception {
        memberVariable=null;
    }

    @Test
    public void returnMemberVariable (){
        String result=memberVariable.isSet("Harry Potter",30,2500.3f);
        assertEquals("Members name:Harry Potter\nMembers age:30\nMembers salary:2500.3",result);
    }
}