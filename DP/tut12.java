// Array partition with minimum difference

import java.util.*;
public class tut12 {
    public static int helper(int idx,int sum,int totSum,int arr[],int dp[][]){
        int n=arr.length;
        if(idx == n){
            return Math.abs((totSum-sum)-sum);
        }
        if(dp[idx][sum] != -1){
            return dp[idx][sum];
        }
        int pick=helper(idx+1, sum+arr[idx], totSum, arr, dp);
        int notPick=helper(idx+1, sum, totSum, arr, dp);

        return dp[idx][sum]=Math.min(pick,notPick);
    }
    public static int minimum(int arr[]){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int dp[][]=new int[n][sum+1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return helper(0, 0, sum, arr, dp);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(minimum(arr));
        sc.close();
    }
}
