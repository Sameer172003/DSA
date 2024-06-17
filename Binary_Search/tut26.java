// Search a 2D Matrix II

public class tut26 {
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
        for(int i=0;i<n;i++){
            boolean flag=binary(mat[i], k);
            if(flag==true){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int k=20;
        int mat[][]={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(search(mat, k));
    }   
}
