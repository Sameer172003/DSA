// Max consecutive ones III

import java.util.*;
public class tut6 {
    public static int longest(int arr[],int n,int k){
        int l=0,r=0,cnt=0,len=0;
        while(r<n){
            if(arr[r] == 0){
                cnt++;
            }
            while(cnt>k){
                if(arr[l] == 0){
                    cnt--;
                }
                l++;
            }
            len=Math.max(len,r-l+1);
            r++;
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
        int k=sc.nextInt();
        System.out.println(longest(arr,n,k));
        sc.close();
    }
}
