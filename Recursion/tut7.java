// Permutaion of string

import java.util.*;
public class tut7 {
    public static String tempStr;
    private static void swap(String s, int i, int j) {
        StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(i, s.charAt(j));
        sb.setCharAt(j, s.charAt(i));
        tempStr = sb.toString();
    }
    private static void Helper(String s, int i, int j, List<String> ans) {
        if (i == j) {
            ans.add(s);
            return;
        }
        for (int k = i; k <= j; k++) {
            swap(s, i, k);
			s=tempStr;
            Helper(s, i + 1, j, ans);
            swap(s, i, k);
			s=tempStr;
        }
    }
    public static List<String> generatePermutations(String s) {
        List<String> ans = new ArrayList<>();
        Helper(s, 0, s.length() - 1, ans);
		Collections.sort(ans);
        return ans;
	}
    public static void main(String args[]){
        String s="ABC";
        List<String> ans = new ArrayList<>();
        ans.addAll(generatePermutations(s));
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i)+" ");
        }
    }
}
