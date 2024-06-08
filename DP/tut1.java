// Climbing Stairs

import java.util.*;
public class tut1{
    public static int count(int n,int dp[]){
        if(n ==  0 || n == 1){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int l=count(n-1,dp);
        int r=count(n-2,dp);

        return dp[n]=l+r;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(count(n,dp));
        sc.close();
    }
}