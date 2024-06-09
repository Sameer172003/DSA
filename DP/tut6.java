// Count unique paths in a grid

import java.util.*;
public class tut6 {
    public static int helper(int i,int j,int dp[][]){
        if(i == 0 && j == 0){
            return 1;
        }
        if(i < 0 || j < 0){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int down=helper(i-1, j, dp);
        int right=helper(i, j-1, dp);

        return dp[i][j]=down+right;
    }
    public static int count(int m,int n){
        int dp[][] = new int[m][n];
        
        for (int[] row : dp)
            Arrays.fill(row, -1);
        return helper(m-1, n-1, dp);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(count(m, n));
        sc.close();
    }
}
