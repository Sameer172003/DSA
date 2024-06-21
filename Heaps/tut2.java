// Implementation of Max Heap 

public class tut2 {
    static int capacity;
    static int size;
    static int arr[]=new int[1000];
    tut2(int cap){
        size=0;
        capacity=cap;
    }
    public static int parent(int i){
        return (i-1)/2;
    }
    public static int left(int i){
        return (2*i+1);
    }
    public static int right(int i){
        return (2*i+2);
    }
    public void insert(int data){
        size++;
        int i=size-1;
        arr[i]=data;
        while(i != 0 && arr[parent(i)] < arr[i]){
            int temp=arr[i];
            arr[i]=arr[parent(i)];
            arr[parent(i)]=temp;
            i=parent(i);
        }
    }
    public static void heapify(int i,int arr[],int size){
        int li=left(i);
        int ri=right(i);
        int greater=i;
        if(li<size && arr[li] > arr[greater]){
            greater=li;
        }
        if(ri<size && arr[ri] > arr[greater]){
            greater=ri;
        }
        while(greater != i){
            int temp=arr[i];
            arr[i]=arr[greater];
            arr[greater]=temp;
            heapify(greater,arr,size);
        }
    }
    public int getMin(){
        return arr[0];
    }
    public int extractMin(){
        if(size<0){
            return -1;
        }
        if(size==0){
            size--;
            return arr[0];
        }
        int temp=arr[0];
        arr[0]=arr[size-1];
        size--;
        heapify(0,arr,size);
        return temp;
    }
    public void decreaseKey(int i,int data){
        arr[i]=data;
        while(i != 0 && arr[parent(i)] > arr[i]){
            int temp=arr[i];
            arr[i]=arr[parent(i)];
            arr[parent(i)]=temp;
            i=parent(i);
        }
    }
    public void delete(int i){
        decreaseKey(i,Integer.MIN_VALUE);
        extractMin();
    }
    public static void buildHeap(int arr[],int size){
        for(int i=(size/2)-1;i>=0;i--){
            heapify(i, arr, size);
        }
    }
    public void print() {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(arr[i] + ": L- " + arr[2 * i] + " R- " + arr[2 * i + 1]);
            System.out.println();
        }
    }
    public static void main(String args[]){
        tut2  maxHeap=new tut2(25);
        maxHeap.insert(1);
        maxHeap.insert(4);
        maxHeap.insert(2);
        maxHeap.insert(5);
        maxHeap.insert(13);
        maxHeap.insert(6);
        maxHeap.insert(17);

        maxHeap.print();
    }
}
