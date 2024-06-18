// Implementation of stack using queue

import java.util.LinkedList;
import java.util.Queue;

public class tut5 {
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    public void push(int a){
        q2.add(a);
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        Queue<Integer> temp=q1;
        q1=q2;
        q2=temp;
    }

    public int pop(){
        if(q1.isEmpty()){
            return -1;
        }
        return q1.remove();
    }

    public int top(){
        return q1.peek();
    }
    public static void main(String args[]){
        tut5 sol=new tut5();
        sol.push(2);
        sol.push(3);
        sol.pop();
        sol.push(4);
        sol.pop();
    }    
}
