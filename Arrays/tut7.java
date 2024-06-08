// Right rotate an array by k times

import java.util.*;
public class tut7 {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void rev(int arr[],int s,int e){
        while(s < e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;

            s++;
            e--;
        }
    }
    public static void rightRotate(int arr[],int d,int n){
        d=d % n;
        rev(arr,0,n-1);
        rev(arr,0,d-1);
        rev(arr,d,n-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        rightRotate(arr, d, n);
        print(arr);
        sc.close();
    }
}
