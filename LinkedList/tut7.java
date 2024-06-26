// Delete the element with value X

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class tut7 {
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
    public static Node deleteValue(Node head,int val){
        if(head == null) return head;
        if(head.data == val){
            head=head.next;
            return head;
        }
        Node temp=head;
        Node prev=null;
        while(temp != null){
            if(temp.data == val){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int val=3;
        Node head=convert(arr);
        head=deleteValue(head,val);
        display(head);
    }
}
