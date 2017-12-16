package com.company;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args)
    {
        HashMap total = new HashMap();
        List nums = new ArrayList<>();
        nums.addAll(Arrays.asList(2, 7, 11, 15));
        int target = 9;

        for(int x = 0; x < nums.size(); x++)
        {
            int complement = target - Integer.parseInt(String.valueOf(nums.get(x)));

            if(total.containsValue(String.valueOf(nums.get(x))))
            {
                System.out.print(nums.get(x) + " ");
                System.out.print(target - complement);
            }
            else
            {
                total.put(target - complement, 1);
            }
        }
    }
}
