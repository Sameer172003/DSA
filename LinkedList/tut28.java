// Merge K sorted Linked Lists

import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class tut28 {
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
    public static Node mergeKlist(Node arr[],int k){
        PriorityQueue<Node> sc=new PriorityQueue<>((x,y)->x.data-y.data);
        Node dummy=new Node(0);
        Node temp=dummy;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != null){
                sc.add(arr[i]);
            }
        }
        while(!sc.isEmpty()){
            Node node=sc.poll();
            if(node.next != null){
                sc.add(node.next);
            }
            temp.next=node;
            temp=temp.next;
        }
        return dummy.next;
    }
    public static void main(String args[]){
        
    }
}
