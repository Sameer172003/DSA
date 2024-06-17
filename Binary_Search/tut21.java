// Aggressive Cows

import java.util.*;
public class tut21 {
    public static boolean possible(int arr[],int dist,int cow){
        int cntCows=1;
        int last=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-last>=dist){
                cntCows++;
                last=arr[i];
            }
        }
        return cntCows>=cow;
    }
    public static int aggressive(int arr[],int k){
        int n=arr.length;
        Arrays.sort(arr);
        int low=1;
        int high=arr[n-1]-arr[0];
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(arr, mid,k)==true){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return high;
    }
    public static void main(String args[]){
        int arr[]={1,2,4,8,9};
        int k=3;
        System.out.println(aggressive(arr, k));
    }    
}
