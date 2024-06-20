// Largest Rectangle in Histogram

import java.util.*;
public class tut25 {
    public static int[] ngr(int arr[]){
        int n=arr.length;
        int ans[]=new int[n];
        Arrays.fill(ans,-1);
        Stack<Integer> sc=new Stack<>();

        for(int i=0;i<n;i++){
            while(!sc.isEmpty() && arr[sc.peek()]>arr[i]){
                ans[sc.peek()]=arr[i];
                sc.pop();
            }
            sc.push(i);
        }
        return ans;
    }
    public static int[] ngl(int arr[]){
        int n=arr.length;
        int ans[]=new int[n];
        Arrays.fill(ans,-1);
        Stack<Integer> sc=new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!sc.isEmpty() && arr[sc.peek()]>arr[i]){
                ans[sc.peek()]=arr[i];
                sc.pop();
            }
            sc.push(i);
        }
        return ans;
    }
    public static int histogram(int arr[]){
        int area=0;
        int ngl[]=ngl(arr);
        int ngr[]=ngr(arr);

        for(int i=0;i<arr.length;i++){
            int curr=(ngr[i]-ngl[i]-1)*arr[i];

            area=Math.max(area,curr);
        }
        return area;
    }
    public static void main(String args[]){
        int arr[]={6,2,5,4,5,1,6};
        System.out.println(histogram(arr));
    }
}
