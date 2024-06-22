// Find the median from a running data stream

import java.util.*;
public class tut13 {
    static PriorityQueue<Integer> minHeap=new PriorityQueue<>();
    static PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
    public static void add(int num){
        if(maxHeap.isEmpty() || maxHeap.peek() >= num){
            maxHeap.add(num);
        }
        else{
            minHeap.add(num);
        }
        if(maxHeap.size() > minHeap.size()+1){
            minHeap.add(maxHeap.poll());
        }
        else if(maxHeap.size() < minHeap.size()){
            maxHeap.add(minHeap.poll());
        }
    }
    public static double getMedian(){
        if(minHeap.size() == maxHeap.size()){
            return minHeap.peek()/2.0 + maxHeap.peek()/2.0;
        }
        return maxHeap.peek();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            add(a);
            System.out.println(getMedian());
        }
        sc.close();
    }
}
