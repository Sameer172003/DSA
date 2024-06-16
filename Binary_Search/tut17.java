// Capacity To Ship Packages Within D Days

import java.util.*;
public class tut17 {
    public static int maxi(int arr[]){
        int n=arr.length;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            ans=Math.max(ans,arr[i]);
        }
        return ans;
    }
    public static int add(int arr[]){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int possible(int arr[],int cap){
        int day=1;
        int load=0;
        for(int i=0;i<arr.length;i++){
            if(load+arr[i]>cap){
                day++;
                load=arr[i];
            }
            else{
                load+=arr[i];
            }
        }
        return day;
    }
    public static int ship(int arr[],int d){
        int low=maxi(arr);
        int high=add(arr);
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(arr, mid)<=d){
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
        int d=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(ship(arr, d));
        sc.close();
    }
}
