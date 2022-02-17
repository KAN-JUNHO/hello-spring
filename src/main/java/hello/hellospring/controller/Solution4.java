package hello.hellospring.controller;

public class Solution4 {
    public static int ans = 0;

    static int solution(int k, int[][] dungeons){
       boolean[] check = new boolean[dungeons.length];
       dfs(k,dungeons,0,check);
       return ans;
    }

    private static void dfs(int k, int[][] dungeons, int cnt, boolean[] check) {
        for(int i=0; i<dungeons.length; i++){
            if(!check[i] && dungeons[i][0]<=k){
                check[i]=true;
                dfs(k-dungeons[i][1],dungeons,cnt+1,check);
                check[i]=false;
            }
        }
        ans = Math.max(ans,cnt);
    }

    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80,20},{50,40},{30,10}};
        System.out.println(solution(k,dungeons));
    }
}
