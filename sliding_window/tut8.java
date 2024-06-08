// Subarrays with k different integers

import java.util.*;
public class tut8 {
    public static int longer(int arr[],int n,int k){
        return helper(arr, n, k)-helper(arr, n, k-1);
    }
    public static int helper(int arr[],int n,int k){
        int l=0,r=0,cnt=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(r<n){
            map.put(arr[r],map.getOrDefault(arr[r], 0)+1);
            while(map.size()>k){
                map.put(arr[l],map.get(arr[l])-1);
                if(map.get(arr[l])==0){
                    map.remove(arr[l]);
                }
                l++;
            }
            cnt=cnt+r-l+1;
            r++;
        }
        return cnt;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(longer(arr, n, k));
        sc.close();
    }
}
