package hello.hellospring.controller;

public class Solution7 {

    public static int solution(int num) {
        int answer = 0;
        while (num!=1){

            if (num%2==0){
                num=num/2;
            }else {
                num=(num*3)+1;
            }
            answer++;
            if(answer==500) {
                answer=-1; break;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(626331));
    }
}
