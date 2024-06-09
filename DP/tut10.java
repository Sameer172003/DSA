// Subset Sum Equal to Target

import java.util.*;
public class tut10 {
    public static boolean helper(int idx,int arr[],int target,int dp[][]){
        if(target == 0){
            return true;
        }
        if(idx == 0){
            return arr[0] == target;
        }
        if(dp[idx][target] != -1){
            return dp[idx][target] == 0 ? true:false;
        }
        boolean notTake=helper(idx-1, arr, target, dp);
        boolean take=false;
        if(arr[idx] < target){
            take=helper(idx-1, arr, target-arr[idx], dp);
        }
        dp[idx][target]=notTake || take ? 1:0;
        return notTake || take;
    }
    public static boolean subset(int arr[],int target){
        int n=arr.length;
        int dp[][]=new int[n][target+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return helper(n-1, arr, target, dp);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(subset(arr, target));
        sc.close();
    }
}
