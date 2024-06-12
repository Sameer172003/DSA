// Best Time to Buy and Sell Stock I

import java.util.*;
public class tut28 {
    public static int stock(int arr[]){
        int profit=0,cost=0;
        int mini=arr[0];
        for(int i=1;i<arr.length;i++){
            cost=arr[i]-mini;
            profit=Math.max(profit,cost);
            mini=Math.min(mini,arr[i]);
        }
        return profit;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(stock(arr));
        sc.close();
    }
}
