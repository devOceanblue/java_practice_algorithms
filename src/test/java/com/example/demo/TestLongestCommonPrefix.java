package com.example.demo;

import org.junit.jupiter.api.Test;

public class TestLongestCommonPrefix {
    @Test
    public void solution(){
        LongestCommonPrefix sol = new LongestCommonPrefix();
        sol.longestCommonPrefix(new String[]{"dog","racecar","car"});
    }
}
