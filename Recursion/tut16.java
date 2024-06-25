// Sudoku Solver

public class tut16 {
    public static void display(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isValid(int grid[][],int row,int col,int c){
        for(int i=0;i<9;i++){
            if(grid[i][col] == c){
                return false;
            }
            if(grid[row][i] == c){
                return false;
            }
            if(grid[3*(row/3)+i/3][3*(col/3)+i%3] == c){
                return false;
            }
        }
        return true;
    }
    public static boolean helper(int grid[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(grid[i][j] == 0){
                    for(int c=1;c<=9;c++){
                        if(isValid(grid, i, j, c)){
                            grid[i][j]=c;
                            
                            if(helper(grid)){
                                return true;
                            }
                            else{
                                grid[i][j]=0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public static void solveSoduku(int grid[][]){
        helper(grid);
    }
    public static void main(String args[]){
        int arr[][]={{3 ,0, 6, 5, 0, 8, 4, 0, 0},
        {5, 2, 0, 0, 0, 0, 0, 0, 0},
        {0, 8, 7, 0, 0, 0, 0, 3, 1 },
        {0, 0, 3, 0, 1, 0, 0, 8, 0},
        {9, 0, 0, 8, 6, 3, 0, 0, 5},
        {0, 5, 0, 0, 9, 0, 6, 0, 0},
        {1, 3, 0, 0, 0, 0, 2 ,5, 0},
        {0, 0, 0, 0, 0, 0 ,0, 7, 4},
        {0, 0, 5, 2, 0, 6, 3, 0, 0}};
        solveSoduku(arr);
        display(arr);
    }
}
