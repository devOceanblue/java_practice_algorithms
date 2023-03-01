package com.example.demo;

import java.util.ArrayList;

public class Problem133502 {

    private int searchHamburger(int[] ingredient, int count){
        /* for문으로 [1,2,3,1]이 있는지 체크한다.
           만약 있다면 [1,2,3,1]을 pop하고 다시 재귀호출한다.
        */
        if(ingredient.length < 4){
            return count;
        }

        ArrayList<Integer> ingredientList = new ArrayList<>(ingredient.length);
        for(int ing: ingredient){
            ingredientList.add(ing);
        }
        int[] hamburger = new int[]{1,2,3,1};
        ArrayList<Integer> nextIngredientList = new ArrayList<>();

        int cur = 0;
        for(int i=0; i<ingredientList.size()-3; i++){
            int toDelete = 1;
            for(int j=i; j<j+4; j++){
                if(ingredientList.get(i) != hamburger[j-i]){
                    toDelete = 0;
                    break;
                }
            }
            if(toDelete==1) {
                nextIngredientList.addAll(ingredientList.subList(0, i));
                nextIngredientList.addAll(ingredientList.subList(i + 4, ingredientList.size()));
                count += 1;
                cur += 1;
            }
        }

        int[] nextIngredient = new int[nextIngredientList.size()];
        int i = 0;
        for(Integer ing: nextIngredientList){
            nextIngredient[i] = ing.intValue();
            i+=1;
        }

        if(cur>0){
            return searchHamburger(nextIngredient, count);
        }
        else{
            return count;
        }
    }
    public int solution(int[] ingredient) {
        return searchHamburger(ingredient, 0);
    }
}
