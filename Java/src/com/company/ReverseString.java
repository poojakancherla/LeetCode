package com.company;


import java.lang.*;
import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String orig = scanner.nextLine();
        char[] s = orig.toCharArray();
        int n = s.length;
        int halfLength = n / 2;
        for (int i=0; i<halfLength; i++)
        {
            char temp = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = temp;
        }
        System.out.print(s);
    }
}
