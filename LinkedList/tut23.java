// Intersection Point in Y Shaped Linked Lists

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class tut23 {
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
    public static int intersect(Node head1,Node head2){
        Node temp1=head1;
        Node temp2=head2;
        
        while(temp1!=null && temp2!=null){
            //both node are point of same node in this case both are saperate list
            if(temp1==temp2)return temp1.data;
            
            //if both are point to null in this case both are 
            else if(temp1.next==null && temp2.next==null)return -1;
            
            //if temp2 reachest null ,in this case it points to the head2
            else if(temp1.next==null && temp2.next!=null)temp1=head2;
            
             //if temp reachest null ,in this case it points to the head1
            else if(temp1.next!=null && temp2.next==null)temp2=head1;
            
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return -1;
    }
    public static void main(String args[]){
        int arr1[]={3,6,9,15,30};
        int arr2[]={10,15,30};
        Node l1=convert(arr1);
        Node l2=convert(arr2);
        System.out.println(intersect(l1, l2));
    }
}
