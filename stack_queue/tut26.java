// Delete Mid of a Stack

import java.util.Stack;

public class tut26 {
    public static void helper(Stack<Integer> inputStack,int cnt,int size){
		if(cnt == size/2){
			inputStack.pop();
			return;
		}
		int num=inputStack.peek();
		inputStack.pop();
		helper(inputStack, cnt+1, size);
	    inputStack.push(num);
	}
    public static void delete(Stack<Integer> inputStack,int N){
        int cnt=0;
        helper(inputStack, cnt,N);
    }
    public static void main(String args[]){
        Stack<Integer> ans=new Stack<>();
        ans.push(50);
        ans.push(40);
        ans.push(30);
        ans.push(20);
        ans.push(10);

        delete(ans, 5);

        while(!ans.isEmpty()){
            System.out.print(ans.pop()+" ");
        }
    }
}
