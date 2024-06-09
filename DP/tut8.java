// Minimum Path sum

import java.util.*;
public class tut8 {
    public static int helper(int i,int j,int arr[][],int dp[][]){
        if(i == 0 && j == 0){
            return arr[0][0];
        }
        if(i < 0 || j < 0){
            return (int)Math.pow(10,9);
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int down=arr[i][j]+helper(i-1, j, arr, dp);
        int right=arr[i][j]+helper(i, j-1, arr, dp);

        return dp[i][j]=Math.min(down, right);
    }
    public static int sum(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        int dp[][]=new int[n][m];
        for(int row[] : dp)
            Arrays.fill(row,-1);
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
        System.out.println(sum(arr));
        sc.close();
    }
}
