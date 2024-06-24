// Tower of Hanoi

public class tut13 {
    static long count=0;
    public static long toh(int n,int s,int d,int a){
        if(n==0){
            return 0;
        }
        toh(n-1, s,a,d);
        System.out.println("Move disk " + n + " from rod " + s + " to rod " + d);
        count++;
        toh(n-1, a, d, s);
        return count;
    }
    public static void main(String args[]){
        int n=2;
        System.out.println(toh(n, 1, 3, 2));
    }
}
