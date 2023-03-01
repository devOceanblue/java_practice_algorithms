package com.example.demo;

import org.junit.jupiter.api.Test;

public class Problem159994Test {
    @Test
    public void test1(){
        Problem159994 sol = new Problem159994();
        String[] card_1 = new String[]{"i","water","drink"};
        String[] card_2 = new String[]{"want", "to"};
        String[] goal = new String[]{"i", "want", "to", "drink", "water"};

        System.out.println(sol.solution(card_1, card_2, goal));
    }
}
