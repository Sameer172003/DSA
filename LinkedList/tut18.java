// Sort a linked list of 0s, 1s and 2s

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class tut18 {
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
    public static Node sort(Node head){
        Node temp=head;
        int cnt0=0;
        int cnt1=0;
        int cnt2=0;
        while(temp != null){
            if(temp.data == 0){
                cnt0++;
            }
            if(temp.data == 1){
                cnt1++;
            }
            if(temp.data == 2){
                cnt2++;
            }
            temp=temp.next;
        }
        temp=head;
        while(cnt0 != 0 || cnt1 != 0 || cnt2 != 0){
            if(cnt0 != 0){
                temp.data=0;
                cnt0--;
            }
            else if(cnt1 != 0){
                temp.data=1;
                cnt1--;
            }
            else{
                temp.data=2;
                cnt2--;
            }
            temp=temp.next;
        }
        return head;
    }
    public static void main(String args[]){
        int arr[]={1,1,0,0,2,2};
        Node head=convert(arr);
        head=sort(head);
        display(head);
    }
}
