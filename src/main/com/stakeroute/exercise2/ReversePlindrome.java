package com.stakeroute.exercise2;

import java.util.Scanner;



public class ReversePlindrome {


    public static String CheckPalindrome(int n) {
        int r;
        int sum=0;
        int temp=n;

        //Reversing the number
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }

        //Checking whether the reversed input matches the input number
        if (temp == sum)
            return ("palindrome number");
        else
            return ("not palindrome");

    }

}



