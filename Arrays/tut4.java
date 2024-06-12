// Remove duplicate elements from sorted array and return the size of final array

import java.util.*;
public class tut4 {
    public static int dupliacte(int arr[],int n){
        int j=0;
        for(int i=1;i<n;i++){
            if(arr[j] != arr[i]){
                j++;
                arr[j]=arr[i];
            }
        }
        return (j+1);
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
