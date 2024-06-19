// Course Schedule I

import java.util.*;
public class tut16 {
    public static boolean course(int numCourse,int course[][]){
        int n=course.length;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourse;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            adj.get(course[i][0]).add(course[i][1]);
        }
        int indeg[]=new int[numCourse];
        Queue<Integer> sc=new LinkedList<>();

        for(int i=0;i<numCourse;i++){
            for(int it:adj.get(i)){
                indeg[it]++;
            }
        }
        for(int i=0;i<numCourse;i++){
            if(indeg[i]==0){
                sc.add(i);
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        while(!sc.isEmpty()){
            int node=sc.peek();
            sc.remove();

            ans.add(node);
            for(int it:adj.get(node)){
                indeg[it]--;
                if(indeg[it]==0){
                    sc.add(it);
                }
            }
        }
        if(ans.size() == numCourse){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        int numCourse=2;
        int course[][]={{1,0}};
        System.out.println(course(numCourse, course));
    }
}
