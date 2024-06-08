// House Robber II

import java.util.*;
public class tut5 {
    public static int helper(int idx,int arr[],int dp[]){
        if(idx<0){
            return 0;
        }
        if(idx == 0){
            return arr[idx];
        }
        if(dp[idx] != -1){
            return dp[idx];
        }
        int p=arr[idx]+helper(idx-2,arr,dp);
        int n=0+helper(idx-1,arr,dp);
        return dp[idx]=Math.max(p,n);
    }
    public static int solve(int nums[]){
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return helper(n-1,nums,dp);
    }
    public static int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        if(n == 1){
            return nums[0];
        }
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            if(i != n-1){
                arr1[i]=nums[i];
            }
            if(i != 0){
                arr2[i]=nums[i];
            }
        }
        int ans1 = solve(arr1);
        int ans2 = solve(arr2);
        return Math.max(ans1,ans2);
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
