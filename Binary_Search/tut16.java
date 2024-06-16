// Smallest Divisor

import java.util.Scanner;

public class tut16 {
    public static int maxi(int arr[]){
        int n=arr.length;
        int ans=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
        }
        return ans;
    }
    public static int hour(int piles[],int h){
        int n=piles.length;
        int time=0;
        for(int i=0;i<n;i++){
            time+= Math.ceil((double)(piles[i]) / (double)(h));
        }
        return time;
    }
    public static int divisor(int arr[],int h){
        int low=1;
        int high=maxi(arr);
        while(low<=high){
            int mid=(low+high)/2;
            if(hour(arr, mid)<=h){
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
        int h=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(divisor(arr, h));
        sc.close();
    }
}
