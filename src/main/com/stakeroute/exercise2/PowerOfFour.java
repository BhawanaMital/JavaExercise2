package com.stakeroute.exercise2;

public class PowerOfFour {
    public static String isPowerOfFour(int n) {
        if (n == 0)
            return "Number is zero";
        while (n != 1) {
            if (n % 4 != 0)
                return "Not a power of 64";
            n = n / 4;
        }
        return "Power of 64";
    }
}



