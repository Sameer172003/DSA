// Longest Common Substring

import java.util.*;
public class tut22 {
    public static int longestCommonSubstr(String S1, String S2, int n, int m){
        // code here
       int[][] dp = new int[n + 1][m + 1];
       for (int rows[] : dp){
            Arrays.fill(rows, -1);
       }
       for (int i = 0; i <= n; i++) {
        dp[i][0] = 0;
      }
      for (int i = 0; i <= m; i++) {
        dp[0][i] = 0;
      }
       int ans = 0;
       for (int idx1 = 1; idx1 <= n; idx1++) {
            for (int idx2 = 1; idx2 <= m; idx2++) {
                // If the characters at the current indices are the same, extend the LCS
                if (S1.charAt(idx1 - 1) == S2.charAt(idx2 - 1)) {
                    int val = 1 + dp[idx1 - 1][idx2 - 1];
                    dp[idx1][idx2] = val;
                    ans = Math.max(ans, val); // Update the maximum LCS length
                } else {
                    dp[idx1][idx2] = 0; // Reset LCS length if characters don't match
                }
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int n=s1.length();
        int m=s2.length();
        System.out.println(longestCommonSubstr(s1, s2, n, m));
        sc.close();
    }
}
