// union of two sorted arrays

import java.util.*;
public class tut10 {
    public static void print(ArrayList<Integer> arr){
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
    public static ArrayList<Integer> helper(int a1[],int a2[],int n,int m){
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0;
        int j=0;
        while(i < n && j < m){
            if(a1[i] <= a2[j]){
                if(ans.size() == 0 || ans.get(ans.size()-1) != a1[i]){
                    ans.add(a1[i]);
                }
                i++;
            }
            else{
                if(ans.size() == 0 || ans.get(ans.size()-1) != a2[j]){
                    ans.add(a2[j]);
                }
                j++;
            }
        }
        while(i < n){
            if(ans.get(ans.size()-1) != a1[i]){
                ans.add(a1[i]);
            }
            i++;
        }
        while(j < m){
            if(ans.get(ans.size()-1) != a2[j]){
                ans.add(a2[j]);
            }
            j++;
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
