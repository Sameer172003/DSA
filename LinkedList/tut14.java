// Find length of Loop in Linked List

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class tut14 {
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
    public static int length(Node head){
        Node slow=head;
        Node fast=head;
        boolean loop=false;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast){
                loop=true;
                break;
            }
        }
        if(!loop){
            return 0;
        }
        int len=1;
        fast=fast.next;
        while(slow != fast){
            fast=fast.next;
            len++;
        }
        return len;
    }
    public static void main(String args[]){
        int arr[]={1,8,3,4};
        Node head=convert(arr);
        System.out.println(length(head));
    }
}
