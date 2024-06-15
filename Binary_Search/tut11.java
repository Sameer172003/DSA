// Peak Index in a Mountain Array

public class tut11 {
    public static int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=high+(low-high)/2;

            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]>arr[mid-1]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={0,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
