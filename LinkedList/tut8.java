// Insert a node at head

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class tut8 {
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
    public static Node insertHead(Node head,int val){
        Node temp=new Node(val);
        temp.next=head;
        head=temp;
        return head;
    }
    public static void main(String args[]){
        int arr[]={2,3,4,5};
        int val=1;
        Node head=convert(arr);
        head=insertHead(head,val);
        display(head);
    }
}
