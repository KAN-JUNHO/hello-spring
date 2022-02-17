package hello.hellospring.controller;


import java.util.Arrays;

import java.util.*;
class Solution {
    public static int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int answer=0;
        for(int i=0; i<moves.length;i++){
            int x=moves[i]-1;
            for(int j=0; j<board.length;j++){
                if(board[j][x]!=0){

                    if(stack.isEmpty()){
                        stack.push(board[j][x]);
                    }else {
                        if (stack.peek()==board[j][x]) {
                            stack.pop();
                            answer+=2;
                        }else {
                            stack.push(board[j][x]);
                        }
                    }

                    board[j][x]=0;
                    break;
                }
            }
        }
        return answer;
    }
    // 4 3 1 1 3 2 4
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},
                        {0,0,1,0,3},
                        {0,2,5,0,1},
                        {4,2,4,4,2},
                        {3,5,1,3,1}};
        int [] moves = {1,5,3,5,1,2,1,4};
        int a= solution(board,moves);
    }
}