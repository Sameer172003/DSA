// Unique Paths II

import java.util.*;
public class tut7 {
    public static int helper(int i,int j,int arr[][],int dp[][]){
        if(i >= 0 && j >= 0 && arr[i][j] == 1){
            return 0;
        }
        if(i == 0 && j == 0){
            return 1;
        }
        if(i < 0 || j < 0){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int down=helper(i-1, j, arr, dp);
        int right=helper(i, j-1, arr, dp);

        return dp[i][j]=down+right;
    }
    public static int count(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        int dp[][] = new int[n][m];
        for (int row[] : dp)
            Arrays.fill(row, -1);
        return helper(n-1, m-1, arr, dp);
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
        System.out.println(count(arr));
        sc.close();
    }  
}
