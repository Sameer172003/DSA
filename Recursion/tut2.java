// Count Good Numbers

public class tut2 {
    public static long MOD=1_000_000_007;
    public static long pow(long x,long n){
        if(n==0){
            return 1;
        }
        long temp=pow(x, n/2);
        if(n%2==0){
            return (temp*temp)%MOD;
        }
        else{
            return (x*temp*temp)%MOD;
        }
    }
    public static int count(int n){
        long even=(n+1)/2;
        long odd=(n)/2;

        long first=pow(5, even)%MOD;
        long second=pow(4, odd)%MOD;

        return (int)((first*second)%MOD);
    }
    public static void main(String args[]){
        int n=4;
        System.out.println(count(n));
    }   
}
