// Insertion at the Kth position

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class tut10{
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
    public static Node insertK(Node head,int k,int val){
        if(head == null){
            if(k == 1){
                return new Node(val);
            }
            else{
                return head;
            }
        }
        if(k == 1){
            Node temp=new Node(val);
            temp.next=head;
            head=temp;
            return head;
        }
        int cnt=0;
        Node temp=head;
        while(temp != null){
            cnt++;
            if(cnt == k-1){
                Node x=new Node(val);
                x.next=temp.next;
                temp.next=x;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,5};
        int val=4;
        int k=4;
        Node head=convert(arr);
        head=insertK(head,k,val);
        display(head);
    }
}