// Number of Enclaves

public class tut9 {
    public static void dfs(int grid[][],int row,int col,int delRow[],int delCol[]){
        int n=grid.length;
        int m=grid[0].length;
        grid[row][col]=0;
        for(int k=0;k<4;k++){
            int nrow=row+delRow[k];
            int ncol=col+delCol[k];

            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]==1){
                dfs(grid,nrow,ncol,delRow,delCol);
            }
        }
    }
    public static int number(int grid[][]){
        int n=grid.length;
        int m=grid[0].length;
        int delRow[]={-1,0,+1,0};
        int delCol[]={0,+1,0,-1};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(i==0 || i==n-1 || j==0 || j==m-1){
                if(grid[i][j]==1){
                    dfs(grid,i,j,delRow,delCol);
                }
               }
            }
        }
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1)res++;
            }
        }
        return res;
    }
    public static void main(String args[]){

    }
}
