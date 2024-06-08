// Missing number in an array

import java.util.*;
public class tut14 {
    public static int helper(int arr[],int n){
        int sum=(n*(n+1))/2;
        int s2=0;
        for(int i=0;i<n;i++){
            s2+=arr[i];
        }
        return (sum-s2);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(helper(arr, n));
        sc.close();
    }
}
