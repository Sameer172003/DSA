// Clone a linked list with next and random pointer

import java.util.HashMap;

class Node{
    int data;
    Node next,random;
    Node(int data){
        this.data=data;
        this.next=null;
        this.random=null;
    }
}
public class tut30 {
    public static Node copyList(Node head){
        HashMap<Node,Node> map=new HashMap<>();
        Node temp=head;

        while(temp != null){
            Node newNode=new Node(temp.data);
            map.put(temp,newNode);
            temp=temp.next;
        }
        Node t=head;
        while(t != null){
            Node node=map.get(t);
            node.next=(t.next != null) ? map.get(t.next):null;
            node.random=(t.random != null) ? map.get(t.random):null;
            t=t.next;
        }
        return map.get(head);
    }
    public static void main(String args[]){

    }
}
