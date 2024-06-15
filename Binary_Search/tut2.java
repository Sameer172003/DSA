// Implement lower bound

import java.util.*;
public class tut2 {
    public static int lower(int arr[],int k){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=k){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(lower(arr, k));
        sc.close();
    }
}
