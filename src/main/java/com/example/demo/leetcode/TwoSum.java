package com.example.demo.leetcode;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            hashmap.put(target-nums[i], i);
        }
        for(int i=0; i<nums.length; i++){
            if(hashmap.get(nums[i]) != null && i!=hashmap.get(nums[i])){
                return new int[]{i,nums[i]};
            }
        }
        return null;
    }
}
