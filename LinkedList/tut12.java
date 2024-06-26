// Find Middle of a Linked List

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class tut12 {
    public static Node convert(int arr[]){
        Node head=new Node(arr[0]);
        Node move=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            move.next=temp;
            move=move.next;
        }
        return head;
    }
    public static int middle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        Node head=convert(arr);
        System.out.println(middle(head));
    }
}
