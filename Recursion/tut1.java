// Pow(x,n)

public class tut1{
    public static double power(double x,int n){
        double ans=1.0;
        long res=n;
        if(res<0){
            res=-1*res;
        }
        while(res>0){
            if(res%2==1){
                ans=ans*x;
                res=res-1;
            }
            else{
                x=x*x;
                res=res/2;
            }
        }
        if(n<0){
            ans=(double)(1.0)/(double)(ans);
        }
        return ans;
    }
    public static void main(String args[]){
        double x=2.0;
        int n=10;
        System.out.println(power(x, n));
    }
}