// Remove duplicate elements from sorted array and return the size of final array

import java.util.*;
public class tut4 {
    public static int dupliacte(int arr[],int n){
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i] != arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return (i+1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(dupliacte(arr, n));
        sc.close();
    }
}
