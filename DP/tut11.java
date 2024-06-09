// Partition eual subset sum

import java.util.*;
public class tut11 {
    public static boolean helper(int idx,int target,int arr[],int dp[][]){
        if(target == 0){
            return true;
        }
        if(idx == 0){
            return arr[0] == target;
        }
        if(dp[idx][target] != -1){
            return dp[idx][target] == 0 ? true:false;
        }
        boolean notTake=helper(idx-1, target, arr, dp);
        boolean take=false;
        if(arr[idx] <= target){
            take=helper(idx, target-arr[idx], arr, dp);
        }
        dp[idx][target]=notTake || take ? 1:0;
        return notTake || take;
    }
    public static boolean partition(int arr[]){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        if(sum % 2 == 1){
            return false;
        }
        else{
            int k=sum/2;
            int dp[][]=new int[n][k+1];
            for(int row[] : dp){
                Arrays.fill(row,-1);
            }
            return helper(n-1, k, arr, dp);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(partition(arr));
        sc.close();
    }
}
