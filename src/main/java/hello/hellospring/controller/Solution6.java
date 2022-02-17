package hello.hellospring.controller;

public class Solution6 {

    public static long solution(int price, int money, int count) {
        long answer = -1;

        long sum=0;
        for(int i=1;i<=count;i++){
            sum += price*i;
        }


        if (sum<=money){
            return 0;
        }
        answer = sum-money;
        return sum-money;

    }

    public static void main(String[] args) {
        solution(3,20,4);
    }
}
