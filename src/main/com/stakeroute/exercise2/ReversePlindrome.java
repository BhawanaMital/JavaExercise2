package com.stakeroute.exercise2;

import java.util.Scanner;



public class ReversePlindrome {


    public static String CheckPalindrome(int n) {
        int r;
        int sum=0;
        int temp=n;

        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            return ("palindrome number");
        else
            return ("not palindrome");

    }

}



