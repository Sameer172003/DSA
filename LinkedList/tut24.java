// Palindrome Linked List

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class tut24 {
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
    public static Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static boolean isPalindrome(Node head){
        if(head == null || head.next == null){
            return true;
        }
        // Step 1: find mid
        Node midNode=findMid(head);

        // Step 2: Reverse
        Node temp=midNode;
        Node prev=null;
        while(temp != null){
            Node front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        Node right=prev;
        Node left=head;

        // Step 3: Check
        while (right != null) {
            if(left.data != right.data){
                return false;
            }
            right=right.next;
            left=left.next;
        }
        return true;
    }
    public static void main(String args[]){
        int arr[]={1,2,0};
        Node head=convert(arr);
        System.out.println(isPalindrome(head));
    }
}
