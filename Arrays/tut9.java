// Move all zeroes to end of the array

import java.util.*;
public class tut9 {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void zeores(int arr[],int n){
        int nz=0;
        int z=0;
        while(nz < n){
            if(arr[nz] != 0){
                int temp=arr[nz];
                arr[nz]=arr[z];
                arr[z]=temp;

                nz++;
                z++;
            }
            else{
                nz++;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        zeores(arr, n);
        print(arr);
        sc.close();
    }
}
