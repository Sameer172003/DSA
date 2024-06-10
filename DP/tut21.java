// Longest Common Subsequence

import java.util.*;
public class tut21 {
    public static int helper(String text1, String text2,int idx1,int idx2,int dp[][]){
        if(idx1 < 0 || idx2 < 0){
            return 0;
        }
        if(dp[idx1][idx2] != -1){
            return dp[idx1][idx2];
        }
        if(text1.charAt(idx1) == text2.charAt(idx2)){
            return dp[idx1][idx2] =1+helper(text1,text2,idx1-1,idx2-1,dp);
        }
        else{
            int ans1= helper(text1,text2,idx1-1,idx2,dp);
            int ans2= helper(text1,text2,idx1,idx2-1,dp);
            return dp[idx1][idx2] = Math.max(ans1,ans2);
        }
    }
    public static int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int dp[][]=new int[n+1][m+1];
        
        for (int rows[] : dp)
            Arrays.fill(rows, -1);
        
        return helper(text1,text2,n-1,m-1,dp);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(longestCommonSubsequence(s1, s2));
        sc.close();
    }
}
