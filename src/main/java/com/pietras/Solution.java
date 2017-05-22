package com.pietras;

public class Solution{
    public int solution(int N){
        int counter=0;
        for (int x = -N; x <=N; x++) {
            for (int y = -N; y <=N; y++) {
                double lengthXY = Math.sqrt((x*x)+(y*y));
                if (lengthXY<=N){
                    counter++;
                }
            }
        }

        if(counter>11111){
            return -1;
        }

        return counter;
    }
}
