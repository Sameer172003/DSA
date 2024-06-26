// Delete Kth Node From End 

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class tut19 {
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
    public static Node removeKthNode(Node head, int K)
    {
        // Write your code here.
        Node slow=head;
        Node fast=head;
        for(int i=0;i<K;i++){
            fast=fast.next;
        }
        if(fast==null){
            return head.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        // Node delNode=slow.next;
        slow.next=slow.next.next;
        return head;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        int k=3;
        Node head=convert(arr);
        head=removeKthNode(head,k);
        display(head);
    }
}
