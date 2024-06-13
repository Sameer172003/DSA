// Rearrange array element by sign

import java.util.*;
public class tut21 {
    public static int[] sign(int arr[]){
        int n=arr.length;
        int ans[]=new int[n];
        int pos=0;
        int neg=1;
        for(int i=0;i<n;i++){
            if(arr[i] < 0){
                ans[neg]=arr[i];
                neg+=2;
            }
            else{
                ans[pos]=arr[i];
                pos+=2;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sign(arr);
        sc.close();
    }
}
