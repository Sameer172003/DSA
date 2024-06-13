// Kadane's Algorithm (Maximum subarray sum)

import java.util.*;
public class tut18 {
    public static int max(int arr[]){
        int n=arr.length;
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum < 0){
                sum=0;
            }
            if(sum > maxi){
                maxi=sum;
            }
        }
        return maxi;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(max(arr));
        sc.close();
    }
}
