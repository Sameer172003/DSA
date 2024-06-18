// Implement Queue using LinkedList

public class tut4 {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node front,rear;
    public void add(int a){
        if(front==null || rear==null){
            front = new Node(a);
            rear=front;
        }
        else{
            rear.next = new Node(a);
            rear=rear.next;
        }
    }
    public int remove(){
        if(front==null)return -1;
        int temp = front.data;
        front=front.next;
        return temp;
    }
    public static void main(String args[]){
        tut4 sol=new tut4();
        sol.add(2);
        sol.add(3);
        sol.remove();
        sol.add(4);
        sol.remove();
    }
}
