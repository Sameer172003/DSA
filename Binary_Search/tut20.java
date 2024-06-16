// Split Array Largest Sum

import java.util.*;
public class tut20 {
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
    public static int split(int arr[],int k){
        int low=maxi(arr);
        int high=add(arr);
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(arr, mid)<=k){
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
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(split(arr, k));
        sc.close();
    }
}
