// Delete Head of the Dll

class Node{
    int data;
    Node next;
    Node prev;
    Node(int data,Node next,Node prev){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public class tut32 {
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
    public static Node deleteHead(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node temp=head;
        head=head.next;
        head.prev=null;
        temp.next=null;

        return head;
    }   
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        Node head=convert(arr);
        head=deleteHead(head);
        display(head);
    }
}
