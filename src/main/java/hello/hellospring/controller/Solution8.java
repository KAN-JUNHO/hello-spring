package hello.hellospring.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution8 {

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i=0; i<prices.length; i++){
            int cnt=0;
            for (int j=i+1; j<prices.length; j++){
                if(prices[i]<=prices[j]){
                    cnt++;
                }
            }
            answer[i]=cnt;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 2, 3});
    }
}
