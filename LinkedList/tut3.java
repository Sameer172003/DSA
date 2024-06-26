// Search in a linkedlist

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class tut3 {
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
    public static boolean isPresent(int key,Node head){
        Node temp=head;
        while(temp != null){
            if(temp.data == key){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int key=4;
        Node head=convert(arr);
        System.out.println(isPresent(key, head));
    }
}
