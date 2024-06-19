// Sort a stack

import java.util.*;
public class tut17 {
    public static void insert(Stack<Integer> s,int e){
        if(s.isEmpty() || s.peek()<e){
            s.push(e);
            return;
        }
        int num=s.peek();
        s.pop();

        insert(s, e);
        s.push(num);
    }
    public static void sort(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int num=s.peek();
        s.pop();

        sort(s);
        insert(s,num);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Stack<Integer> s=new Stack<>();
        int n=sc.nextInt();
        s.push(n);
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
        sort(s);
        sc.close();
    }
}
