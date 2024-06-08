// Second largest element in an array

import java.util.*;
public class tut2 {
    public static int second_largest(int arr[],int n){
        int max=arr[0];
        int second=-1;
        for(int i=0;i<n;i++){
            if(arr[i] > max){
                max=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i] != max && arr[i] > second){
                second=arr[i];
            }
        }
        return second;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(second_largest(arr, n));
        sc.close();
    }
}
