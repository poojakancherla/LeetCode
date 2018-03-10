package com.company;

import java.util.*;

public class Factorial
{

    public static int fact(int n)
    {
        if(n < 2)
            return 1;
        else
            return n * fact(n-1);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Factorial f = new Factorial();
        System.out.println(f.fact(n));
    }

}
