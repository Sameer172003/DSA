// Minimum Add to Make Parentheses Valid

public class tut3 {
    public static int minimum(String s){
        int open=0;
        int close=0;
        int cnt=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch == '('){
                open++;
            }
            else{
                close++;
            }
            if(close > open){
                cnt+=(close-open);
                close=0;
                open=0;
            }
        }
        cnt+=(open-close);
        return cnt;
    }
    public static void main(String args[]){
        String s="(((";
        System.out.println(minimum(s));
    }
}
