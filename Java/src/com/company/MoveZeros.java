package com.company;

import java.util.*;

public class MoveZeros
{
    public static void main(String[] args)
    {
        List<Integer> nums = new ArrayList<Integer>((Arrays.asList(0, 1, 0, 3, 12)));
        List<Integer> zeros = new ArrayList<Integer>();

        for(int i = 0; i < nums.size(); i++)
        {
            if(nums.get(i) == 0)
            {
                nums.remove(nums.get(i));
                zeros.add(0);
            }
        }
        nums.addAll(zeros);
        System.out.println(nums);

    }
}
