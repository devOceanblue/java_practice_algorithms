package com.example.demo.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        int minLength = strs[0].length();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<minLength; i++){
            char c = strs[0].charAt(i);
            for(String str:strs){
                if(c!=str.charAt(i)){
                    return sb.toString();
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
