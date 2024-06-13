// Best time to buy and sell a stock

import java.util.*;
public class tut19 {
    public static int stock(int arr[]){
        int profit=0;
        int cost=0;
        int min=arr[0];

        for(int i=1;i<arr.length;i++){
            cost=arr[i]-min;
            profit=Math.max(profit,cost);
            min=Math.min(min,arr[i]);
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
