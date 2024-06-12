// Longest Bitonic Subsequence

import java.util.*;
public class tut30 {
    public static int bitonic(int arr[]){
        int n=arr.length;

        int[] dp1 = new int[n];
        Arrays.fill(dp1, 1);
        for(int i = 0; i<n; i++){
            for(int j = 0; j<i; j++){
                if(arr[i] > arr[j] && dp1[i] < 1 + dp1[j]){
                    dp1[i] = 1 + dp1[j];
                }
            }
        }

        int[] dp2 = new int[n];
        Arrays.fill(dp2, 1);   
        for(int i = n-1; i>=0; i--){
            for(int j = n-1; j>i; j--){
                if(arr[i] > arr[j] && dp2[i] < 1 + dp2[j]){
                    dp2[i] = 1 + dp2[j];
                }
            }
        }

        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            if (dp1[i] > 1 && dp2[i] > 1) {
                maxLength = Math.max(maxLength, dp1[i] + dp2[i] - 1);
            }
        }        
        return maxLength;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(bitonic(arr));
        sc.close();
    }
}
