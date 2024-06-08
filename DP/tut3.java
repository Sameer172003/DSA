// Frog jump with k distance

import java.util.*;
public class tut3 {
    public static int helper(int ind,int arr[],int dp[],int k){
        if (ind == 0)
            return 0;
        if (dp[ind] != -1)
            return dp[ind];

        int mmSteps = Integer.MAX_VALUE;
        for (int j = 1; j <= k; j++) {
            if (ind - j >= 0) {
                int jump = helper(ind - j, arr, dp, k) + Math.abs(arr[ind] - arr[ind - j]);
                mmSteps = Math.min(jump, mmSteps);
            }
        }
        return dp[ind] = mmSteps;
    }
    public static int minimizeCost(int arr[],int N,int K){
        int[] dp = new int[N];
        Arrays.fill(dp, -1); 
        return helper(N - 1, arr, dp, K);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(minimizeCost(arr,n,k));
        sc.close();
    }
}
