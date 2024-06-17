// Search a 2D Matrix

public class tut25 {
    public static boolean binary(int arr[],int k){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid] == k){
                return true;
            }
            else if(arr[mid] > k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
    public static boolean search(int mat[][],int k){
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            if(mat[i][0]<=k && k<=mat[i][m-1]){
                return binary(mat[i], k);
            }
        }
        return false;
    }
    public static void main(String args[]){
        int k=3;
        int mat[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(search(mat, k));
    }    
}
