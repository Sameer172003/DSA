// 2 sum

import java.util.*;
public class tut16 {
    public static boolean sum(int arr[],int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int rem=k-arr[i];
            if(map.containsKey(rem)){
                return true;
            }
            map.put(arr[i],i);
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sum(arr,k));
        sc.close();
    }
}
