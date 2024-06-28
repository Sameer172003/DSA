// Insert at Tail in DLL

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
public class tut36 {
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
    public static Node insertHead(Node head,int val){
        Node newNode=new Node(val, head, null);
        head.prev=newNode;
        return newNode;
    }
    public static Node insertTail(Node head,int val){
        if(head.next == null){
            return insertHead(head, val);
        }
        Node temp=head;
        while(temp.next != null){
            temp=temp.next;
        }
        Node back=temp.prev;
        Node newnode=new Node(val, temp, back);
        back.next=newnode;
        temp.prev=newnode;

        return head;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,5};
        int val=4;
        Node head=convert(arr);
        head=insertTail(head, val);
        display(head);
    }
}
