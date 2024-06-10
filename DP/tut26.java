// Edit Distance

import java.util.*;
public class tut26 {
    public static int editDistance(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        int dp[][]=new int[n+1][m+1];

        for(int i=0;i<=n;i++){
            dp[i][0]=i;
        }
        for(int j=0;j<=m;j++){
            dp[0][j]=j;
        }
        for(int idx1=1;idx1<n+1;idx1++){
            for(int idx2=1;idx2<m+1;idx2++){
                if(s1.charAt(idx1-1) == s2.charAt(idx2-1)){
                    dp[idx1][idx2]=dp[idx1-1][idx2-1];
                }
                else{
                    int ans1=1+dp[idx1-1][idx2];
                    int ans2=1+dp[idx1][idx2-1];
                    int ans3=1+dp[idx1-1][idx2-1];

                    dp[idx1][idx2]=Math.min(ans1,Math.min(ans2,ans3));
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(editDistance(s1, s2));
        sc.close(); 
    }
}
