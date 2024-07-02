// Largest Odd Number in String

public class tut8 {
    public static String odd(String s){
        for(int i=s.length()-1;i>=0;i--){
            if((s.charAt(i) - '0') % 2 != 0){
                return s.substring(0,i+1);
            }
        }
        return "";
    }
    public static void main(String args[]){
        String s="52";
        System.out.println(odd(s));
    }
}
