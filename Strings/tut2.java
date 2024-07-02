// Reverse Words in a String

public class tut2 {
    public static String revString(String s){
        String arr[]=s.trim().split("\\s+");
        String ans="";
        for(int i=arr.length-1;i>0;i--){
            ans+=arr[i]+" ";
        }
        ans+=arr[0];
        return ans;
    }
    public static void main(String args[]){
        String s="the sky is blue";
        System.out.println(revString(s));
    }
}
