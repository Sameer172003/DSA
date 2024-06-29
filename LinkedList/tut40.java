// Remove duplicates from sorted DLL

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
public class tut40 {
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
    public static Node duplicate(Node head){
        Node temp=head;
        while(temp != null && temp.next != null){
            Node nextnode=temp.next;
            while(nextnode != null && nextnode.data == temp.data){
                nextnode=nextnode.next;
            }
            temp.next=nextnode;
            if(nextnode != null){
                nextnode.prev=temp;
            }
            temp=temp.next;
        }
        return head;
    }
    public static void main(String args[]){
        int arr[]={1,1,2,3,4,4,5};
        Node head=convert(arr);
        head=duplicate(head);
        display(head);
    }
}
