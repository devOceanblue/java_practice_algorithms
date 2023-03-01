package com.example.demo;

import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;


class Problem159994 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> cards1_queue = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> cards2_queue = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> goal_queue = new LinkedList<>(Arrays.asList(goal));

        for (String g : goal_queue) {
            if (g.equals(cards1_queue.peek())) {
                cards1_queue.poll();
            } else if (g.equals(cards2_queue.peek())) {
                cards2_queue.poll();
            } else {
                return "NO";
            }
        }
        return "Yes";
    }
}