package com.stakeroute.exercise2;

public class StudentGrade {
    public static String readGradeInput(int NumberOfStudent, int[] NGrades)
    {
        //Checking whether the Number of student lies within range or not
        if(NumberOfStudent<0  || NumberOfStudent >100)
            return "Wrong Input";

        //Checking whether the grades of student is eual to number of student
        if(NGrades.length!=NumberOfStudent)
        {
            return "Wrong Input";
        }

        //Checking whether the grades lies within range or not
        for (int i =0;i<NumberOfStudent;i++)
        {
            if(NGrades[i]<0 || NGrades[i]>100)
            {
                return "Wrong Input";
            }
        }

        String Result="";

        double tot=0;

        //Adding the grades of the student
        for (int i =0;i<NumberOfStudent;i++)
        {
            tot = tot + NGrades[i];
        }

        String avg = avg(tot,NumberOfStudent);

        int min = min(NGrades,NumberOfStudent);
        int max = max(NGrades,NumberOfStudent);

        Result = "The average is "+avg+" The minimum is "+min+" The maximum is "+max;

        return Result;
    }

    //Calculating the average of student
    public static String avg(double total,int N){

        String s="";
        return s+(total/N);
    }

    //Calculating the minimum marks of student
    public static int min(int[] NGrades, int N)
    {
        int min= NGrades[0];
        for (int i=1;i<N;i++)
        {
            if(NGrades[i]<min)
            {
                min = NGrades[i];
            }
        }

        return min;
    }

    //Calculating the maximum marks of student
    public static int max(int[] NGrades, int N)
    {
        int max= NGrades[0];
        for (int i=1;i<N;i++)
        {
            if(NGrades[i]>max)

            {
                max = NGrades[i];
            }
        }

        return max;
    }
}
