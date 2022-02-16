package hello.hellospring.controller;


import java.util.Arrays;

import java.util.*;
class Solution {
    public static boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        int length = phone_book.length;

        Map<String, String> map = new HashMap<String, String>();

        for(String temp : phone_book){
            map.put(temp, temp);
        }

        for(String str : phone_book){
            for(int index = 0; index < str.length(); index++){
                String temp = str.substring(0, index);
                if( map.containsKey( temp ) ){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        boolean a= solution(new String[]{"119", "97674223", "1195524421"});
    }
}