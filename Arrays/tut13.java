// Maximum consecutive 1's in an array

import java.util.*;
public class tut13 {
    public static int helper(int arr[],int n){
        int cnt=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i] == 1){
                cnt++;
                max=Math.max(max,cnt);
            }
            else{
                cnt=0;
            }
        }
        return max;
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
