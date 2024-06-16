// Number of distinct islands

import java.util.ArrayList;
import java.util.HashSet;

public class tut8 {
    private static String toString(int r,int c){
        return Integer.toString(r)+" "+Integer.toString(c);
    }
    public static void dfs(int row,int col,int vis[][],int grid[][],ArrayList<String> temp,int r0,int c0){
        int n = grid.length;
        int m = grid[0].length;

        vis[row][col]=1;

        temp.add(toString(row-r0,col-c0));
        int delRow[]={-1,0,+1,0};
        int delCol[]={0,-1,0,+1};

        for(int i=0;i<4;i++){
            int nrow=row+delRow[i];
            int ncol=col+delCol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                dfs(nrow,ncol,vis,grid,temp,r0,c0);
            }
        }

    }
    public static int distinct(int grid[][]){
        int n = grid.length;
        int m = grid[0].length;

        int vis[][]=new int[n][m];
        HashSet<ArrayList<String>> ans=new HashSet<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j] == 0 && grid[i][j] == 1){
                    ArrayList<String> temp=new ArrayList<>();
                    dfs(i,j,vis,grid,temp,i,j);
                    ans.add(temp);
                }
            }
        }
        return ans.size();
    }
    public static void main(String args[]){

    }
}
