// Leaders in an array

import java.util.*;
public class tut23 {
    public static void display(ArrayList<Integer> arr){
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
    public static ArrayList<Integer> leader(int arr[]){
        int n=arr.length;
        ArrayList<Integer> ans=new ArrayList<>();
        int maxi=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(arr[i] >= maxi){
                ans.add(arr[i]);
            }
            maxi=Math.max(maxi,arr[i]);
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> ans=new ArrayList<>();
        ans.addAll(leader(arr));
        display(ans);
        sc.close();
    }
}
