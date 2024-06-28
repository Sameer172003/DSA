// Delete the Kth Element in DLL

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
public class tut34 {
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
    public static Node deleteK(Node head,int k){
        if(head == null){
            return null;
        }
        Node temp=head;
        int cnt=0;
        while(temp != null){
            cnt++;
            if(cnt == k){
                break;
            }
            temp=temp.next;
        }
        Node back=temp.prev;
        Node front=temp.next;

        if(back == null && front == null){
            return null;
        }
        if(back == null){
            return deleteHead(head);
        }
        if(front == null){
            return deleteTail(head);
        }
        back.next=front;
        front.prev=back;

        temp.next=null;
        temp.prev=null;

        return head;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        int k=3;
        Node head=convert(arr);
        head=deleteK(head, k);
        display(head);
    }
}
