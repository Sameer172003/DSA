// Add 2 Number in Linked Lists

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class tut20 {
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
    public static Node rev(Node head){
        Node temp=head;
        Node prev=null;
        while(temp != null){
            Node front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public static Node add(Node l1,Node l2){
        Node dummy=new Node(0);
        Node temp=dummy;
        int carry=0;
        int sum=0;
        while(l1 != null || l2 != null || carry == 1){
            sum=0;
            if(l1 != null){
                sum+=l1.data;
                l1=l1.next;
            }
            if(l2 != null){
                sum+=l2.data;
                l2=l2.next;
            }
            sum+=carry;
            carry=sum/10;
            Node sumNode=new Node(sum%10);
            temp.next=sumNode;
            temp=temp.next;
        }
        return dummy.next;
    }
    public static void main(String args[]){
        int arr1[]={2,4,3};
        int arr2[]={5,6,4};
        Node l1=convert(arr1);
        Node l2=convert(arr2);
        Node head=add(l1, l2);
        display(head);
    }
}
