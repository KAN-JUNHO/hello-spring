package hello.hellospring.controller;

import java.util.*;

public class Solution2 {
    public static int  solution(String s) {
        Map<String,String> map = new HashMap<>();
        String answer="";

        map.put("zero","0");
        map.put("one","1");
        map.put("two","2");
        map.put("three","3");
        map.put("four","4");
        map.put("five","5");
        map.put("six","6");
        map.put("seven","7");
        map.put("eight","8");
        map.put("nine","9");

        for(String num: map.keySet()){
            s = s.replace(num,map.get(num));
        }





        return Integer.parseInt(s);
    }
    // 4 3 1 1 3 2 4
    public static void main(String[] args) {
        solution("one4seveneight");
    }
}
