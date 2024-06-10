// Coin Change I

import java.util.*;
public class tut17 {
    public static int helper(int idx,int coins[],int amount,int dp[][]){
        if(idx == 0){
            if(amount % coins[0] == 0){
                return amount/coins[0];
            }
            else{
                return (int)Math.pow(10,9);
            }
        }
        if(dp[idx][amount] != -1){
            return dp[idx][amount];
        }
        int notTake=0+helper(idx-1, coins, amount, dp);
        int take=(int)(Math.pow(10,9));
        if(coins[idx] <= amount){
            take=1+helper(idx, coins, amount-coins[idx], dp);
        }
        return dp[idx][amount]=Math.min(notTake, take);
    }
    public static int coin(int coins[],int amount){
        int n=coins.length;
        int[][] dp = new int[n][amount + 1];

        for (int row[] : dp)
            Arrays.fill(row, -1);

        int ans = helper(n-1, coins, amount, dp);
        if (ans >= (int) Math.pow(10, 9))
            return -1;
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(coin(arr, target));;
        sc.close();
    }
}
