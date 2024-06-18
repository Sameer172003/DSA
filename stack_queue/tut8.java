// Min Stack

import java.util.*;
public class tut8 {
    private static Stack<Integer> stack = new Stack<Integer>();
    // minStack: store the current min values
    private static Stack<Integer> minStack = new Stack<Integer>();

    public void push(int x){
        stack.push(x);
        if(minStack.isEmpty() || x <= minStack.peek()){
            minStack.push(x);
        }
    }
    public int pop(){
        if(stack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        return stack.pop();
    }
    public int top(){
        if(stack.isEmpty()){
            return -1;
        }
        else{
            return stack.peek();
        }
    }
    public int getMin(){
        if(stack.isEmpty()){
            return -1;
        }
        else{
            return minStack.peek();
        }
    }
    public static void main(String args[]){

    }
}
