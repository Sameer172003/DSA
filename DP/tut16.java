// Unbounded Knapsack

import java.util.*;
public class tut16 {
    public static int helper(int idx,int w,int val[],int wt[],int dp[][]){
        if(idx == 0){
            return (int)(w/wt[0])*val[0];
        }
        if(dp[idx][w] != -1){
            return dp[idx][w];
        }
        int notTake=0+helper(idx-1, w, val, wt, dp);
        int take=Integer.MIN_VALUE;
        if(wt[idx] <= w){
            take=val[idx]+helper(idx, w-wt[idx], val, wt, dp);
        }
        return dp[idx][w]=Math.max(take,notTake);
    }
    public static int unbounded(int w,int val[],int wt[]){
        int n=val.length;
        int dp[][] = new int[n][w + 1];
        for (int row[] : dp) {
            Arrays.fill(row, -1);
        }
        return helper(n-1, w, val, wt, dp);
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
        System.out.println(unbounded(w, value, wt));
        sc.close();
    }
}
