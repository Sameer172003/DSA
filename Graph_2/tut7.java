// Number of Islands

public class tut7 {
    public static void dfs(int row,int col,char grid[][],int delRow[],int delCol[]){
        int n=grid.length;
        int m=grid[0].length;

        grid[row][col]='0';

        for(int i=0;i<4;i++){
            int nrow=row+delRow[i];
            int ncol=col+delCol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]=='1'){
                dfs(nrow, ncol, grid, delRow, delCol);
            }
        }
    }
    public static int islands(char grid[][]){
        int n=grid.length;
        int m=grid[0].length;

        int cnt=0;

        int delRow[]={-1,0,+1,0};
        int delCol[]={0,+1,0,-1};

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    cnt++;
                    dfs(i, j, grid, delRow, delCol);
                }
            }
        }
        return cnt;
    }
    public static void main(String args[]){

    }    
}
