package com.company.other;

public class Recursion {
    public static int fibbo(int num)
    {
        if (num == 1) return 1;
        if (num == 2) return 1;
        return fibbo(num - 1) + fibbo(num - 2);
    }
}
