// Celebrity Problem

import java.util.*;
public class tut19 {
    public static int isCelebrity(int M[][],int n){
        Stack<Integer> sc=new Stack<>();
    	for(int i=0;i<n;i++){
    	    sc.push(i);
    	}
    	while(sc.size()>1){
    	    int f=sc.pop();
    	    int s=sc.pop();
    	    
    	    if(M[f][s]==1){
    	        sc.push(s);
    	    }
    	    else{
    	        sc.push(f);
    	    }
    	}
    	if (sc.isEmpty()){
            return -1;
    	}
    	int celeb=sc.pop();
    	for(int i=0;i<n;i++){
    	    if(celeb != i && (M[i][celeb]==0 || M[celeb][i]==1)){
    	        return -1;
    	    }
    	}
    	return celeb;
    }
    public static void main(String args[]){
        int n=3;
        int M[][]={{0, 1, 0},
        {0 ,0, 0}, 
        {0 ,1 ,0}};
        System.out.println(isCelebrity(M, n));
    }
}
