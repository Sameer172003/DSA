// Intersection of two sorted arrays

import java.util.*;
public class tut11 {
    public static void print(ArrayList<Integer> arr){
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
    public static ArrayList<Integer> helper(int arr1[],int arr2[],int n,int m){
        int i=0;
        int j=0;
        ArrayList<Integer> ans=new ArrayList<>();
        while(i<n && j<m){
            if(arr1[i] < arr2[j]){
                i++;
            }
            else if(arr1[i] > arr2[j]){
                j++;
            }
            else{
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a1[]=new int[n];
        int a2[]=new int[m];
        for(int i=0;i<n;i++){
            a1[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            a2[i]=sc.nextInt();
        }
        ArrayList<Integer> ans=helper(a1, a2, n, m);
        print(ans);
        sc.close();
    }
}
