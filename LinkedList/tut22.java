// Even and Odd nodes in Linked List (variation II)

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class tut22 {
    public static Node display(Node head){
        Node temp=head;
        while (temp != null) {
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
    public static Node odd_even(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node eH=null;
        Node eE=null;
        Node oH=null;
        Node oE=null;
        Node temp=head;

        while(temp != null){
            if(temp.data % 2 == 0){
                if(eH == null){
                    eH=temp;
                    eE=eH;
                }
                else{
                    eE.next=temp;
                    eE=eE.next;
                }
            }
            else{
                if(oH == null){
                    oH=temp;
                    oE=oH;
                }
                else{
                    oE.next=temp;
                    oE=oE.next;
                }
            }
            temp=temp.next;
        }
        if(oH == null || eH == null){
            return head;
        }
        eE.next=oH;
        oE.next=null;
        return eH;
    }
    public static void main(String args[]){
        int arr[]={17,15,8,9,2,4,6};
        Node head=convert(arr);
        head=odd_even(head);
        display(head);
    }
}
