package hello.hellospring.controller;

import java.util.Map;

import static java.lang.Math.abs;

public class Solution3 {

    public static String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;
        int right = 12;
        for (int i=0; i<numbers.length; i++){
            if(numbers[i]==0){
                numbers[i]=10;
            }
            if (numbers[i]%3 == 1){
                answer+="L";
                left=numbers[i];
            }else if(numbers[i]%3 == 0){
                answer+="R";
                right=numbers[i];
            }else {
                int leftLength = pos(left,numbers[i]);
                int rightLength = pos(right,numbers[i]);
                if (leftLength<rightLength){
                    answer += "L";
                    left=numbers[i];
                }else if (leftLength>rightLength){
                    answer+="R";
                    right=numbers[i];
                }else {
                    if(hand.equals("left")){
                        answer+="L";
                        left=numbers[i];
                    }else {
                        answer+="R";
                        right=numbers[i];
                    }
                }
            }
        }
        return answer;
    }
    public static int pos(int start, int end){
        int startX = (start-1)/3;
        int startY = (start-1)%3;
        int endX = end/3;
        int endY = 1;
        return Math.abs(startX-endX) + Math.abs(startY-endY);
    }
    public static void main(String[] args) {
        int [] numbers={1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";

        String answer = solution(numbers,hand);
        System.out.println(answer);
    }
}