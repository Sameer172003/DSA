// Find Nth root of M

import java.util.*;
public class tut13 {
    public static int root(int n,int m){
        int low=1;
        int high=m;
        while(low<=high){
            int mid=(low+high)/2;
            if((Math.pow(mid,n))==m){
                return mid;
            }
            else if((Math.pow(mid,n))<m){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(root(n, m));
        sc.close();
    }
}
