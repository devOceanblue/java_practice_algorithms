package com.example.demo;

import com.example.demo.leetcode.LongestCommonPrefix;
import org.junit.jupiter.api.Test;

public class TestLongestCommonPrefix {
    @Test
    public void solution(){
        LongestCommonPrefix sol = new LongestCommonPrefix();
        sol.longestCommonPrefix(new String[]{"dog","racecar","car"});
    }
}
