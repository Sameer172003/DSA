// Delete Tail of DLL

class Node{
    int data;
    Node next;
    Node prev;
    Node(int data,Node next,Node prev){
        this.data=data;
        this.next=next;
        this.prev=prev;
    }
}
public class tut33 {
    public static Node display(Node head){
        Node temp=head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        return head;
    }
    public static Node convert(int arr[]){
        Node head=new Node(arr[0],null,null);
        Node prev=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i],null,prev);
            prev.next=temp;
            prev=prev.next;
        }
        return head;
    }
    public static Node deleteTail(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node temp=head;
        while(temp.next != null){
            temp=temp.next;
        }
        Node curr=temp.prev;
        curr.next=null;
        temp.prev=null;

        return head;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        Node head=convert(arr);
        head=deleteTail(head);
        display(head);
    }
}
