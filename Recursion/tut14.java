// Josephus problem

public class tut14 {
    public static int solve(int n,int k){
        if(n == 1){
            return 0;
        }
        return (solve(n-1, k)+k)%n;
    }
    public static int problem(int n,int k){
        int ans=solve(n, k)+1;
        return ans;
    }
    public static void main(String args[]){
        int n=3;
        int k=2;
        System.out.println(problem(n, k));
    }    
}
