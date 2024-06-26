// Delete Middle of Linked List

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class tut16 {
    public static Node display(Node head){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        return head;
    }
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
    public static Node middle(Node head){
        Node slow=head;
        Node fast=head;
        fast=fast.next.next;
        if(head == null || head.next == null) return null;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        Node head=convert(arr);
        head=middle(head);
        display(head);
    }
}
