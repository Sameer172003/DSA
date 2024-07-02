// Rotate String

public class tut7 {
    public static boolean isRotate(String s,String goal){
        if(s.length() != goal.length()){
            return false;
        }
        String str=s+s;
        if(!str.contains(goal)){
            return false;
        }
        return true;
    }
    public static void main(String args[]){
        String s="abcde";
        String goal="cdeab";

        System.out.println(isRotate(s, goal));
    }
}
