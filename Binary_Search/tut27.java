// Find Peak element II

public class tut27 {
    public static int getMax(int mat[][],int mid){
        int index = -1;
        int maxi = Integer.MIN_VALUE;

        for (int row = 0; row < mat.length; row++) {
            int elm = mat[row][mid];

            if (elm > maxi) {
                maxi=elm;
                index = row;
            }
        }
        return index;
    }
    public static int[] peak(int matrix[][]){
        // int n=matrix.length;
        int m = matrix[0].length;

        int start = 0;
        int end = m - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int row = getMax(matrix, mid);
            int left = -1;
            int right = -1;

            // handling edge cases
            if (mid - 1 >= 0) {
                left = matrix[row][mid - 1];
            }

            if (mid + 1 < m) {
                right = matrix[row][mid + 1];
            }

            // we find peak element
            if (matrix[row][mid] > left && matrix[row][mid] > right) {
                return new int[]{row, mid};
            }

            // our peak is on the left side of mid so eliminate the right part
            else if (matrix[row][mid] > right) {
                end = mid - 1;
            }

            // our peak is on the right side of mid so eliminate the left part
            else {
                start = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String args[]){
        int mat[][]={{10,20,15},{21,30,14},{7,16,32}};
        int ans[]=peak(mat);
        System.out.println(ans[0]+" "+ans[1]);
    }
}
