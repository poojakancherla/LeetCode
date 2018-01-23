package com.company;


public class MoveZeros
{
    public static void main(String[] args)
    {
        int temp;
        int counter = 0;
        int[] nums = new int[]{0, 1, 0, 3, 12};
        for(int i = 0; i < nums.length; i++)
        {
            if (nums[i] != 0)
            {
                temp = nums[counter];
                nums[counter] = nums[i];
                nums[i] = temp;
                counter++;
            }

        }


        for(int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i] + " ");
        }


    }
}
