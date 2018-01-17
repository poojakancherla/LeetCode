package com.company;

public class SingleNumber
{
    public static void main(String[] args)
    {
        int[] nums = new int[]{1,1,3,3,4,7,4,5,5};

        int ans =0;

        int len = nums.length;
        for(int i=0;i<len;i++)
            ans ^= nums[i];

        System.out.print(ans);
    }
}
