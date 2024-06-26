// Delete a tail node of a linkedlist

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class tut5 {
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
    public static Node deleteTail(Node head){
        if(head == null || head.next == null) return null;
        Node temp=head;
        while(temp.next.next != null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4};
        Node head=convert(arr);
        head=deleteTail(head);
        display(head);
    }
}
