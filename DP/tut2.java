// Frog jump

import java.util.*;
public class tut2 {
    public static int helper(int idx,int arr[],int n,int dp[]){
        if(idx == 0){
            return 0;
        }
        if(dp[idx] != -1){
            return dp[idx];
        }
        int one=helper(idx-1, arr, n, dp)+Math.abs(arr[idx]-arr[idx-1]);
        int two=Integer.MAX_VALUE;
        if(idx > 1){
            two=helper(idx-2, arr, n, dp)+Math.abs(arr[idx]-arr[idx-2]);
        }
        return dp[idx]=Math.min(one,two);
    }
    public static int count(int arr[],int n){
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n-1, arr, n, dp);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(count(arr, n));
        sc.close();
    }
}
