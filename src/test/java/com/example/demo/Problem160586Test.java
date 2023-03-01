package com.example.demo;

import org.junit.jupiter.api.Test;

public class Problem160586Test {
    @Test
    public void test1(){
        Problem160586 sol = new Problem160586();
        String[] keymap = new String[]{"ABACD", "BCEFD"};
        String[] targets = new String[]{"ABCD","AABB"};

        System.out.println(sol.solution(keymap, targets));
    }
}
