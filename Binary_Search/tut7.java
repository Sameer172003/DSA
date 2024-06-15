// Count occurrences of a number in a sorted array with duplicates

public class tut7 {
    public static int lower(int arr[],int k){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=k){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int upper(int arr[],int k){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>k){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int number(int arr[],int k){
        return upper(arr, k)-lower(arr, k);
    }
    public static void main(String args[]){
        int arr[]={1, 1, 2, 2, 2, 2, 3};
        int k=2;
        System.out.println(number(arr, k));
    }
}
