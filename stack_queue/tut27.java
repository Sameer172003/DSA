// Maximal Rectangle

import java.util.Stack;

public class tut27 {
    public static int histogram(int arr[]){
        int n=arr.length;
        int nsr[]=new int[n];
        int nsl[]=new int[n];
        Stack<Integer> sc=new Stack<>();
        for(int i=0;i<n;i++){
            while(!sc.isEmpty() && arr[sc.peek()] >= arr[i]){
                sc.pop();
            }
            if(sc.isEmpty()){
                nsl[i]=-1;
            }
            else{
                nsl[i]=sc.peek();
            }
            sc.push(i);
        }
        sc.clear();
        for(int i=n-1;i>=0;i--){
            while(!sc.isEmpty() && arr[sc.peek()] >= arr[i]){
                sc.pop();
            }
            if(sc.isEmpty()){
                nsr[i]=n;
            }
            else{
                nsr[i]=sc.peek();
            }
            sc.push(i);
        }
        int area=0;
        for(int i=0;i<n;i++){
            area=Math.max(area,arr[i]*(nsr[i]-nsl[i]-1));
        }
        return area;
    }
    public static int maximal(int mat[][]){
        int n=mat.length;
        int m=mat[0].length;
        int ans=0;
        int arr[]=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == 0){
                    arr[j]=0;
                }
                else{
                    arr[j]=arr[j]+1;
                }
            }
            ans=Math.max(ans, histogram(arr));
        }
        return ans;
    }
    public static void main(String args[]){
        int mat[][]={{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
        System.out.println(maximal(mat));
    }
}
