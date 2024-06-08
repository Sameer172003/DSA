// House robber

import java.util.*;
public class tut4 {
    public static int helper(int idx,int arr[],int dp[]){
        if(idx == 0){
            return arr[idx];
        }
        if(idx < 0){
            return 0;
        }
        if(dp[idx] != -1){
            return dp[idx];
        }
        int pick=arr[idx]+helper(idx-2,arr,dp);
        int notPick=0+helper(idx-1,arr,dp);
        return dp[idx]= Math.max(pick,notPick);
    }
    public static int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return helper(n-1,nums,dp);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(rob(arr));
        sc.close();
    }
}
