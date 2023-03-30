package com.example.demo.leetcode;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String sl = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        for(int i=0; i<sl.length(); i++){
            if(sl.charAt(i) != sl.charAt(sl.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
