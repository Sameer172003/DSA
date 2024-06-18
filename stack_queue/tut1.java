// Implement Stack using array

public class tut1{
    static int top;
    static int arr[]=new int[1000];
    public tut1(){
        top=-1;
    }
    public void push(int a){
        top++;
        arr[top]=a;
    }
    public int pop(){
        if(top == -1){
            return -1;
        }
        else{
            int x=arr[top];
            top--;
            return x;
        }
    }
    public int top(){
        return arr[top];
    }
    public static void main(String args[]){
        tut1 sol=new tut1();
        sol.push(2);
        sol.push(3);
        System.out.println(sol.top());
        sol.pop();
        System.out.println(sol.top());
        sol.push(4); 
        System.out.println(sol.top());
        sol.pop();
        System.out.println(sol.top());
    }
}