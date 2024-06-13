// Sort 0's 1's 2's

import java.util.*;
public class tut17 {
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int arr[]){
        int cnt0=0,cnt1=0,cnt2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                cnt0++;
            }
            else if(arr[i] == 1){
                cnt1++;
            }
            else{
                cnt2++;
            }
        }
        for(int i=0;i<cnt0;i++){
            arr[i]=0;
        }
        for(int i=cnt0;i<(cnt0+cnt1);i++){
            arr[i]=1;
        }
        for(int i=(cnt0+cnt1);i<(cnt0+cnt1+cnt2);i++){
            arr[i]=2;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        display(arr);
        System.out.println();
        sort(arr);
        display(arr);
        sc.close();
    }
}
