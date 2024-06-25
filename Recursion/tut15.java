// Rat in a maze

import java.util.*;
public class tut15 {
    public static void helper(int i,int j,int a[][],String move,ArrayList<String> ans,int vis[][]){
        int n=a.length;
        // Base case
        if(i == n-1 && j == n-1){
            ans.add(move);
            return;
        }
          // Downward
          if(i+1<n && vis[i+1][j] == 0 && a[i+1][j] == 1){
            vis[i][j]=1;
            helper(i+1,j,a,move+'D',ans,vis);
            vis[i][j]=0;
        }
        // Left
        if(j-1>=0 && vis[i][j-1] == 0 && a[i][j-1] == 1){
            vis[i][j]=1;
            helper(i,j-1,a,move+'L',ans,vis);
            vis[i][j]=0;
        }
        // Right
        if(j+1<n && vis[i][j+1] == 0 && a[i][j+1] == 1){
            vis[i][j]=1;
            helper(i,j+1,a,move+'R',ans,vis);
            vis[i][j]=0;
        }
        // Upward
        if(i-1>=0 && vis[i-1][j] == 0 && a[i-1][j] == 1){
            vis[i][j]=1;
            helper(i-1,j,a,move+'U',ans,vis);
            vis[i][j]=0;
        }
    }
    public static ArrayList<String> rat(int arr[][]){
        int n=arr.length;
        ArrayList<String> ans=new ArrayList<>();
        int vis[][]=new int[n][n];
        if(arr[0][0] == 1) helper(0, 0, arr, "", ans, vis);
        return ans;
    }
    public static void main(String args[]){
        int arr[][]={{1, 0, 0, 0},
        {1, 1, 0, 1}, 
        {1, 1, 0, 0},
        {0, 1, 1, 1}};
        ArrayList<String> res=new ArrayList<>();
        res.addAll(rat(arr));
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i)+" ");
        }
    }    
}
