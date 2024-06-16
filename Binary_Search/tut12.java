// Square Root of a number

import java.util.*;
public class tut12 {
    public static int square(int n){
        int low=1;
        int high=n;
        int ans=1;
        while(low<=high){
            int mid=(low+high)/2;
            if(mid*mid<=n){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(square(n));
        sc.close();
    }
}
