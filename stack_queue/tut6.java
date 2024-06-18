// Implementation of queue using stacks

import java.util.Stack;
public class tut6 {
    static Stack <Integer> input = new Stack <> ();
    static Stack <Integer> output = new Stack <> ();

    public void add(int x){
        while(!input.isEmpty()){
            output.push(input.peek());
            input.pop();
        }
        input.push(x);
        while(!output.isEmpty()){
            input.push(output.peek());
            output.pop();
        }
    }

    public int remove(){
        if(input.isEmpty()){
            return -1;
        }
        int val=input.peek();
        input.pop();
        return val;
    }

    public int peek(){
        if(input.isEmpty()){
            return -1;
        }
        return input.peek();
    }
    
    public static void main(String args[]){
        tut6 sol=new tut6();
        sol.add(1);
        sol.add(2);
        System.out.println(sol.peek());
        sol.remove();
    }
}
