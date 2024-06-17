// K-th element of two sorted Arrays

public class tut23 {
    public static double kth(int a[],int b[],int n,int m,int k){
        if(n>m){
            return kth(b,a,m,n,k);
        }
        int left=k;
        int low=Math.max(0,k-m);
        int high=Math.min(k,n);

        while(low<=high){
            int mid1=(low+high)/2;
            int mid2=left-mid1;

            int l1=Integer.MIN_VALUE;
            int l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE;
            int r2=Integer.MAX_VALUE;

            if(mid1-1 >= 0) l1=a[mid1-1];
            if(mid2-1 >= 0) l2=b[mid2-1];

            if(mid1 < n) r1=a[mid1];
            if(mid2 < m) r2=b[mid2];

            if(l1<=r2 && l2<=r1){
                return Math.max(l1,l2);
            }
            else if(l1>r2){
                high=mid1-1;
            }
            else{
                low=mid1+1;
            }
        }
        return 0;
    }
    public static void main(String args[]){
        int a[]={2, 3, 6, 7, 9};
        int b[]={1, 4, 8, 10};

        int k=5;

        System.out.println(kth(a, b, a.length, b.length, k));
    }   
}
