package com.company;

import java.util.Scanner;

public class SumOfTwoIntegers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a == 0) System.out.println(b);
        else if(b == 0) System.out.println(a);
        else
        {
            while(b!= 0)
            {
                int carry = a & b;
                a = a ^ b;
                b = carry << 1;
            }

            System.out.print(a);
        }

    }
}
