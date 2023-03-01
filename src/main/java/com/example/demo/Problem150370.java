package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;

public class Problem150370 {
    private int TODAY;
    private HashMap<String, Integer> TERMS;
    private ArrayList<Integer> COUNT = new ArrayList<Integer>();


    public void count_valid(String[] privacies){
        int i = 1;
        for(String p: privacies){
            String[] p_array = p.split("\\s");
            String[] days = p_array[0].split("[.]");
            int numberOfDays = Integer.parseInt(days[0])*12*28 + Integer.parseInt(days[1])*28 + Integer.parseInt(days[2]);
            if(numberOfDays + TERMS.get(p_array[1]) <= TODAY){
                COUNT.add(i);
            }
            i += 1;
        }
    }

    public void parse_params(String today, String[] terms, String[] privacies){
        String[] today_days = today.split("[.]");
        TODAY = Integer.parseInt(today_days[0])*12*28 + Integer.parseInt(today_days[1])*28 + Integer.parseInt(today_days[2]);

        TERMS = new HashMap<String, Integer>();
        for(String t:terms){
            String[] temp_term = t.split(" ");
            TERMS.put(temp_term[0], Integer.parseInt(temp_term[1])*28);
        }
    }
    public int[] solution(String today, String[] terms, String[] privacies) {
        parse_params(today, terms, privacies);
        count_valid(privacies);
        System.out.println("");
        return COUNT.stream().mapToInt(i->i).toArray();
    }
}
