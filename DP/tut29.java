// Longest Increasing Subsequence

import java.util.*;
public class tut29 {
    public static int longest(int arr[]){
        int n=arr.length;
        int dp[]=new int[n];
        Arrays.fill(dp,1);

        for(int i=0;i<n;i++){
            for(int prev=0;prev<i;prev++){
                if(arr[i] > arr[prev]){
                    dp[i]=Math.max(dp[i],1+dp[prev]);
                }
            }
        }
        int ans=-1;
        for(int i=0;i<n;i++){
            ans=Math.max(ans,dp[i]);
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(longest(arr));
        sc.close();
    }
}
