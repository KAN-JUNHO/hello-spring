package hello.hellospring.controller;

import java.util.*;
public class Solution5 {

    public static boolean solution(int x){
        boolean answer = true;
        List<Integer> box = new ArrayList<>();
        int temp=x;
        while(x>9){
            box.add(x%10);
            x=x/10;
        }
        box.add(x);
        int hap=0;
        for (int i=0;i<box.size();i++){
            hap+= box.get(i);
        }
        if (temp%hap==0){
            answer=true;
        }else {
            answer=false;
        }

        return answer;
    }


    public static void main(String[] args) {
        solution(12);
    }
}
