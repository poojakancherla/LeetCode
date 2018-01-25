package com.company;
import java.util.*;
public class ExcelSheetColumnNumber
{


    public static void main(String[] args)
    {
        String s = "AC";
        int result = 0;
        HashMap dict = new HashMap();
        for(int i = 65; i < 91; i++)
        {
            dict.put((char)i, i - 64);
        }
        for(int i = 0; i < s.length(); i++)
        {
            result = result*26 + (int)(dict.get(s.charAt(i)));
        }


        System.out.print(result);
    }
}
