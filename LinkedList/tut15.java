// Find the first node of loop in linked list

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class tut15 {
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
    public static int findFirstNode(Node head){
        //code here
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast){
                slow=head;
                while(slow != fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow.data;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={1,8,3,4};
        Node head=convert(arr);
        System.out.println(findFirstNode(head));
    }
}
