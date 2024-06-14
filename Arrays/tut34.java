// Find Repeat and Missing Number

public class tut34 {
    public static int[] findTwoElement(int arr[]) {
        // code here
        int n=arr.length;
        int hash[]=new int[n+1];
        int miss=-1;
        int repeat=-1;
        
        for(int i=0;i<n;i++){
            hash[arr[i]]++;
        }
        for(int i=1;i<=n;i++){
            if(hash[i] == 2)repeat=i;
            else if(hash[i] == 0)miss=i;
            
            if(miss != -1 && repeat != -1){
                break;
            }
        }
        int ans[]={repeat,miss};
        return ans;
    }
    public static void main(String args[]){
        int[] a = {3, 1, 2, 5, 4, 6, 7, 5};
        int[] ans = findTwoElement(a);
        System.out.println("The repeating and missing numbers are: {"+ ans[0] + ", " + ans[1] + "}");
    }
}
