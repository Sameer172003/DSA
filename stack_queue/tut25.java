// Largest Rectangle in Histogram

import java.util.*;
public class tut25 {
    public static int histogram(int arr[]){
        int n=arr.length;
        int nsr[]=new int[n];
        int nsl[]=new int[n];
        Stack<Integer> sc=new Stack<>();
        for(int i=0;i<n;i++){
            while(!sc.isEmpty() && arr[sc.peek()] >= arr[i]){
                sc.pop();
            }
            if(sc.isEmpty()){
                nsl[i]=-1;
            }
            else{
                nsl[i]=sc.peek();
            }
            sc.push(i);
        }
        sc.clear();
        for(int i=n-1;i>=0;i--){
            while(!sc.isEmpty() && arr[sc.peek()] >= arr[i]){
                sc.pop();
            }
            if(sc.isEmpty()){
                nsr[i]=n;
            }
            else{
                nsr[i]=sc.peek();
            }
            sc.push(i);
        }
        int area=0;
        for(int i=0;i<n;i++){
            area=Math.max(area,arr[i]*(nsr[i]-nsl[i]-1));
        }
        return area;
    }
    public static void main(String args[]){
        int arr[]={2,1,5,6,2,3};
        System.out.println(histogram(arr));
    }
}
