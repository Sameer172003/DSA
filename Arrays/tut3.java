// Check if array is sorted or not

import java.util.*;
public class tut3 {
    public static boolean check(int arr[],int n){
        for(int i=1;i<n-1;i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(check(arr, n));
        sc.close();;
    }
}
