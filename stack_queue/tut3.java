// Implementation of stack using LinkedList

public class tut3 {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node top;
    public void push(int a){
        Node temp=new Node(a);
        temp.next=top;
        top=temp;
    }
    public int pop(){
        if(top == null){
            return -1;
        }
        else{
            int x=top.data;
            top=top.next;
            return x;
        }
    }
    public int peek(){
        return top.data;
    }
    public static void main(String args[]){
        tut3 sol=new tut3();
        sol.push(2);
        sol.push(3);
        sol.pop();
        sol.push(4);
        sol.pop();
        System.out.println(sol.peek());
    }
}
