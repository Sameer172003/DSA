// Implement Queue using array

public class tut2 {
    static int front,rear;
    static int arr[]=new int[1000];
    public tut2(){
        front=0;
        rear=0;
    }
    public void add(int a){
        arr[rear]=a;
        rear++;
    }
    public int remove(){
        if(front == rear){
            return -1;
        }
        else{
            int x=arr[front];
            front++;
            return x;
        }
    }
    public int peek(){
        return arr[front];
    }
    public static void main(String args[]){
        tut2 q=new tut2();
        q.add(4);
        q.add(14);
        q.add(24);
        q.add(34);
        System.out.println("The peek of the queue before deleting any element = " + q.peek());
        System.out.println("The first element to be deleted = " + q.remove());
        System.out.println("The peek of the queue after deleting an element = " + q.peek());
    }
}
