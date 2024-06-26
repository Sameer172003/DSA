// Insertion before the value X

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class tut11 {
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
    public static Node insertX(Node head,int el,int val){
        if(head == null){
            return null;
        }
        if(head.data == el){
            Node temp=new Node(val);
            temp.next=head;
            head=temp;
            return head;
        }
        Node temp=head;
        while(temp.next != null){
            if(temp.next.data == val){
                Node c=new Node(el);
                c.next=temp.next;
                temp.next=c;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,5};
        int val=4;
        int el=5;
        Node head=convert(arr);
        head=insertX(head,val,el);
        display(head);
    }
}
