// Implementation of Min Heap 

public class tut1{
    static int capacity;
    static int size;
    static int arr[]=new int[1000];
    tut1(int cap){
        size=0;
        capacity=cap;
    }
    static int parent(int i){
        return (i-1)/2;
    }
    static int left(int i){
        return (2*i+1);
    }
    static int right(int i){
        return (2*i+2);
    }
    public void insert(int data){
        size++;
        int i=size-1;
        arr[i]=data;

        while(i != 0 && arr[parent(i)] > arr[i]){
            int temp=arr[i];
            arr[i]=arr[parent(i)];
            arr[parent(i)]=temp;
            i=parent(i);
        }
    }
    public static void heapify(int i){
        int li=left(i);
        int ri=right(i);
        int small=i;
        if(li<size && arr[li]<arr[small]){
            small=li;
        }
        if(ri<size && arr[ri]<arr[small]){
            small=ri;
        }
        if(small != i){
            int temp=arr[i];
            arr[i]=arr[small];
            arr[small]=temp;
            heapify(small);
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
        heapify(0);
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
    public static void buildHeap(int arr[]){
        for(int i=(size-2)/2;i>=0;i--){
            heapify(i);
        }
    }
    public void print(){
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(" PARENT : " + arr[i] + " LEFT CHILD : " + arr[2 * i]
                + " RIGHT CHILD :" + arr[2 * i + 1]);
            System.out.println();
        }
    }
    public static void main(String args[]){
        tut1 minHeap=new tut1(15);
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(17);
        minHeap.insert(10);
        minHeap.insert(84);
        minHeap.insert(19);
        minHeap.insert(6);
        minHeap.insert(22);
        minHeap.insert(9);
        minHeap.print();
    }
}