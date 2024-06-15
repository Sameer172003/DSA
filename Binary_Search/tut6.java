// Find First and Last Position of Element in Sorted Array

public class tut6 {
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
    public static int[] combine(int arr[],int k){
        int n=arr.length;
        int lb=lower(arr, k);

        if(lb == n || arr[lb] != k) return new int[] {-1,-1};

        return new int[] {lb,upper(arr, k)-1};
    }
    public static void main(String args[]){
        int arr[]={5,7,7,8,8,10};
        int k=8;
        int ans[]=combine(arr, k);
        System.out.println(ans[0]+" "+ans[1]);
    }
}
