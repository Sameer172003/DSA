// Delete a head node in linkedlist

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class tut4 {
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
    public static Node deleteHead(Node head){
        if(head == null) return head;
        head=head.next;
        return head;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4};
        Node head=convert(arr);
        head=deleteHead(head);
        display(head);
    }
}
