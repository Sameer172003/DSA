// Stock Span Problem

import java.util.*;
public class tut18 {
    public static int[] stock_span(int arr[]){
        Stack<Integer> sc=new Stack<>();
        int res[]=new int[arr.length];
        sc.push(0);
        res[0]=1;

        for(int i=1;i<arr.length;i++){
            while(!sc.isEmpty() && arr[i]>arr[sc.peek()]){
                sc.pop();
            }
            res[i]=sc.isEmpty()?(i+1):(i-sc.peek());
            sc.push(i);
        }
        return res;
    }
    public static void main(String args[]){
        int arr[]={100 ,80 ,60 ,70 ,60 ,75 ,85};
        int ans[]=stock_span(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
