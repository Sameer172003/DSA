// Rod Cutting

import java.util.*;
public class tut20 {
    public static int helper(int idx,int N,int price[],int dp[][]){
        if(idx == 0){
            return N*price[0];
        }
        if(dp[idx][N] != -1){
            return dp[idx][N];
        }
        int notTake=0+helper(idx-1, N, price, dp);
        int take=Integer.MIN_VALUE;
        int rodLength=idx+1;
        if(rodLength <= N){
            take=price[idx]+helper(idx,N-rodLength, price, dp);
        }
        return dp[idx][N]=Math.max(take,notTake);
    }
    public static int rod(int price[],int n){
        int[][] dp = new int[n][n + 1];
        for (int row[] : dp)
            Arrays.fill(row, -1);
        return helper(n - 1, n,price, dp);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(rod(arr, n));
        sc.close();
    }
}
