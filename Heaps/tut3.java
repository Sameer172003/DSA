// Does array represent Heap

public class tut3 {
    public static boolean isHeap(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[(i-1)/2] < arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int arr[]={90, 15, 10, 7, 12, 2};
        System.out.println(isHeap(arr));
    }    
}
