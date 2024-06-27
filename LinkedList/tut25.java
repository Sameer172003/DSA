// Rotate a Linked List

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class tut25 {
    public static Node display(Node head){
        Node temp=head;
        while (temp != null) {
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
    public static Node rotate(Node head,int k){
        if(head == null || head.next == null || k == 0) return head;
        Node temp=head;
        int len=1;
        while(temp.next != null){
            len++;
            temp=temp.next;
        }
        // Link tail to head
        //  1->2->3->4->5-->|
        //  ^-------------<|
        temp.next=head;
        k=k%len;
        k=len-k;
        while(k != 0){
            temp=temp.next;
            k--;
        }
        // 1->2->3  head->4->5
        head=temp.next;
        // 1->2->3->null
        temp.next=null;
        return head;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int k=2;
        Node head=convert(arr);
        head=rotate(head, k);
        display(head);
    }
}
