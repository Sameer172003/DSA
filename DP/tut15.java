// 0-1 knapsack

import java.util.*;
public class tut15 {
    public static int helper(int idx,int w,int value[],int wt[],int dp[][]){
        if(idx == 0){
            if(wt[0] <= w){
                return value[0];
            }
            else{
                return 0;
            }
        }
        if(dp[idx][w] != -1){
            return dp[idx][w];
        }
        int notTake=0+helper(idx-1, w, value, wt, dp);
        int take=Integer.MIN_VALUE;
        if(wt[idx] <= w){
            take=value[idx]+helper(idx-1, w-wt[idx], value, wt, dp);
        }
        return dp[idx][w]=Math.max(take,notTake);
    }
    public static int knapsack(int w,int value[],int wt[]){
        int n=value.length;
        int dp[][] = new int[n][w + 1];
        for (int row[] : dp) {
            Arrays.fill(row, -1);
        }
        return helper(n-1, w, value, wt, dp);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int w=sc.nextInt();
        int value[]=new int[n];
        for(int i=0;i<n;i++){
            value[i]=sc.nextInt();
        }
        int wt[]=new int[n];
        for(int i=0;i<n;i++){
            wt[i]=sc.nextInt();
        }
        System.out.println(knapsack(w, value, wt));
        sc.close();
    }
}
