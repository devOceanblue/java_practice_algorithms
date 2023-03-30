package com.example.demo.leetcode;

public class BinarySearch {

    public int binarySearch(int[] nums, int left, int right, int target) {
        int mid = 0;
        if (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] > target) {
                return binarySearch(nums, left, mid, target);
            } else if (nums[mid] < target) {
                return binarySearch(nums, mid, right, target);
            } else {
                return mid;
            }
        }
        else{
            return -1;
        }
    }
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1, target);
    }
}
