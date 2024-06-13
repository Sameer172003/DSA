// Majority element I

import java.util.*;
public class tut20 {
    public static int majority(int arr[]){
        int maj=arr[0];
        int cnt=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] == maj){
                cnt++;
            }
            else{
                cnt--;
            }
            if(cnt == 0){
                maj=arr[i];
                cnt=1;
            }
        }
        int cnt1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == maj){
                cnt1++;
            }
        }
        if(cnt1 > (arr.length/2)){
            return maj;
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(majority(arr));
        sc.close();
    }
}
