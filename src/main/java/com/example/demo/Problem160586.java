package com.example.demo;

import java.util.HashMap;


public class Problem160586 {
    public int[] solution(String[] keymap, String[] targets) {
        float inf = Float.POSITIVE_INFINITY;
        HashMap<Character, Integer> hashkey = new HashMap<Character, Integer>();
        for(String key: keymap){
            char[] keyCharArray = key.toCharArray();

            for(int i=0; i<keyCharArray.length; i++){
                hashkey.put(keyCharArray[i], Math.min(hashkey.getOrDefault(keyCharArray[i], (int)inf), i+1));
            }
        }

        int[] result = new int[targets.length];

        int count = 0;
        for(String t: targets){
            char[] charArray = t.toCharArray();
            for(char c:charArray){
                if(hashkey.containsKey(c)){
                    result[count] += hashkey.get(c).intValue();
                }
                else{
                    result[count] = -1;
                    break;
                }
            }
            count += 1;
        }
        return result;
    }
}
