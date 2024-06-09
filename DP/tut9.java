// Minimum Path sum in Triangular grid

import java.util.*;
public class tut9 {
    public static int helper(int i,int j,int arr[][],int dp[][]){
        int n=arr.length;
        if(i == n-1){
            return arr[i][j];
        }
        if(dp[i][j] != -10001){
            return dp[i][j];
        }
        int up=arr[i][j]+helper(i+1, j, arr, dp);
        int diagonal=arr[i][j]+helper(i+1, j+1, arr, dp);

        return dp[i][j]=Math.min(up, diagonal);
    }
    public static int sum(int arr[][]){
        int n=arr.length;
        int dp[][]=new int[n][n];
        for(int row[] : dp)
            Arrays.fill(row,-10001);
        return helper(0, 0, arr, dp);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println(sum(arr));
        sc.close();
    }
}
