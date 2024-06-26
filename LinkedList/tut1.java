// Convert Array to LinkedList

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class tut1{
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
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        Node head=convert(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}