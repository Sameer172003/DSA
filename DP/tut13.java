// Count subsets with sum k

import java.util.*;
public class tut13 {
    public static int helper(int idx,int arr[],int sum,int dp[][],int mod){
        if(idx == 0){
            if(arr[idx] == 0){
                if(sum == 0){
                    return 2;
                }
            }
            else{
                if(sum == 0){
                    return 1;
                }
            }
        }
        if(idx == 0){
            if(sum == arr[idx]){
                return 1;
            }
            else{
                return 0;
            }
        }
        if(dp[idx][sum] != -1){
            return dp[idx][sum];
        }
        int notTake=helper(idx-1, arr, sum, dp, mod);
        int take=0;
        if(arr[idx] <= sum){
            take=helper(idx-1, arr, sum-arr[idx], dp, mod);
        }
        return dp[idx][sum]=(take+notTake)%mod;
    }
    public static int count(int arr[],int sum){
        int n=arr.length;
        int dp[][]=new int[n][sum+1];
        for(int row[] : dp){
            Arrays.fill(row,-1);
        }
        int mod=(int)Math.pow(10,9);
        return helper(n-1, arr, sum, dp, mod);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(count(arr, target));
        sc.close();
    }
}
