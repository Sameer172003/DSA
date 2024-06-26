// Count LinkedList

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class tut2 {
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
    public static int count(Node head){
        int cnt=0;
        Node temp=head;
        while (temp != null) {
            temp=temp.next;
            cnt++;
        }
        return cnt;
    }
    public static void main(String args[]){
        int arr[]={1,2,4,5};
        Node head=convert(arr);
        System.out.println(count(head));
    }
}
