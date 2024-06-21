// Convert Min Heap to Max Heap

public class tut4 {
    public static void heapify(int i,int arr[],int n){
        int li=2*i+1;
        int ri=2*i+2;
        int larger=i;
        if(li<n && arr[li] > arr[larger]){
            larger=li;
        }
        if(ri<n && arr[ri] > arr[larger]){
            larger=ri;
        }
        while(larger != i){
            int temp=arr[i];
            arr[i]=arr[larger];
            arr[larger]=temp;
            heapify(larger, arr, n);
        }
    }
    public static void maxHeap(int arr[],int N){
        for(int i=arr.length;i>=0;i--){
            heapify(i, arr, N);
        }
    }
    public static void main(String args[]){
        int N=4;
        int arr[]={1,2,3,4};
        maxHeap(arr, N);
    }
}
