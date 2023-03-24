package com.example.demo;

public class PalindromeNumber {
    public boolean solution(int x){
        String s = String.valueOf(x);
        StringBuffer sb = new StringBuffer(s);
        String rs = sb.reverse().toString();

        if(s.equals(rs)){
            return true;
        }
        else{
            return false;
        }
    }

}
