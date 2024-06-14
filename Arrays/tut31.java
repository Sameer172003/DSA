// Largest subarray with 0 sum

import java.util.*;
public class tut31 {
    public static int maxLen(int arr[], int n)
    {
        // Your code here
        int len=0;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            else if(map.containsKey(sum-0)){
                len=Math.max(len,i-map.get(sum-0));
            }
        }
        return len;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxLen(arr, n));
        sc.close();
    }
}
