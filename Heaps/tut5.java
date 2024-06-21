// Heap Sort

public class tut5 {
    public static int[] heapSort(int arr[],int n){
        buildHeap(arr,n);
        for(int i=n-1;i>=0;i--){
           int temp=arr[0];
           arr[0]=arr[i];
           arr[i]=temp;
          heapify(arr,i,0); 
        }
        return arr;
    }
    public static void buildHeap(int arr[],int n){
        for(int i=(n-2)/2;i>=0;i--){
            heapify(arr,n,i);
        }
    }
    public static void heapify(int arr[],int n,int i){
        int left=2*i+1, right=2*i+2;
        int largest=i;
        if(left<n && arr[left] >arr[largest]) largest=left;
        if(right<n && arr[right]>arr[largest]) largest=right;
        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            heapify(arr,n,largest);
        }
    }
    public static void main(String args[]){
        int n=5;
        int arr[]={4,1,3,9,7};
        int ans[]=heapSort(arr,n);
        for(int i=0;i<ans.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
