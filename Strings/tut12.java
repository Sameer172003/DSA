// Maximum Nesting Depth of the Parentheses

public class tut12 {
    public static int depth(String s){
        int max=0;
        int curr=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch == '('){
                curr++;
                if(max < curr){
                    max=curr;
                }
            }
            else if(ch ==')'){
                curr--;
            }
            else{
                continue;
            }
        }
        return max;
    }
    public static void main(String args[]){
        String s="(1+(2*3)+((8)/4))+1";
        System.out.println(depth(s));
    }
}
