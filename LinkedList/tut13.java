// Detect a loop in Linked List

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class tut13 {
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
    public static boolean isLoop(Node head){
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={1,8,3,4};
        Node head=convert(arr);
        System.out.println(isLoop(head));
    }
}
