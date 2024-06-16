// Minimum days to make M bouquets

import java.util.*;
public class tut15 {
    public static boolean possible(int arr[],int day,int m,int k){
        int n=arr.length;
        int cnt=0;
        int noB=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=day){
                cnt++;
            }
            else{
                noB+=(cnt/k);
                cnt=0;
            }
        }
        noB+=(cnt/k);
        return noB>=m;
    }
    public static int minimum(int arr[],int m,int k){
        long val = (long) m * k;
        int n = arr.length; // Size of the array
        if (val > n) return -1; // Impossible case.
        // Find maximum and minimum:
        int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mini = Math.min(mini, arr[i]);
            maxi = Math.max(maxi, arr[i]);
        }
        int low=mini;
        int high=maxi;

        while(low<=high){
            int mid=(low+high)/2;
            if(possible(arr,mid,m, k)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(minimum(arr, m, k));
        sc.close();
    }
}
