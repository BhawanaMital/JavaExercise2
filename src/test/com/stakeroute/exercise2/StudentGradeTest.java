package com.stakeroute.exercise2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradeTest {

    StudentGrade ob;

    @Before
    public void setUp() throws Exception {

        ob = new StudentGrade();
    }

    @After
    public void tearDown() throws Exception {
        ob = null;
    }

    @Test
    public void getNumberOfStudentAndGrades()
    {
        int Grades[] = {86,65,98,77};
        String Result = ob.readGradeInput(4,Grades);
        assertEquals("The average is 81.5 The minimum is 65 The maximum is 98",Result);
    }

    @Test
    public void getAvg()
    {
        String Avg = ob.avg(410,4);
        assertEquals("102.5",Avg);
    }

    @Test
    public void getMin()
    {
        int Grades[] = {86,65,98,77};
        int Min = ob.min(Grades,4);
        assertEquals(65,Min);
    }

    @Test
    public void geMax()
    { int Grades[] = {86,65,98,77};
        int Max = ob.max(Grades,4);
        assertEquals(98,Max);
    }

    @Test
    public void wrongInputTest1()
    {
        int Grades[] = {55,99,67,99};
        String Result = ob.readGradeInput(99,Grades);
        assertEquals("Wrong Input",Result);
    }

    @Test
    public void wrongInputTest2()
    {
        int Grades[] = {55,141,67,99};
        String Result = ob.readGradeInput(89,Grades);
        assertEquals("Wrong Input",Result);
    }

    @Test
    public void wrongInputTest3()
    {
        int Grades[] = {55,89,67,99};
        String Result = ob.readGradeInput(209,Grades);
        assertEquals("Wrong Input",Result);
    }

}