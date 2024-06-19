// Course Schedule II

import java.util.*;
public class tut17 {
    public static int[] course(int numCourse,int course[][]){
        int n=course.length;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourse;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            adj.get(course[i][1]).add(course[i][0]);
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
        int topo[]=new int[numCourse];
        int i=0;
        while(!sc.isEmpty()){
            int node=sc.peek();
            sc.remove();

            topo[i++]=node;
            for(int it:adj.get(node)){
                indeg[it]--;
                if(indeg[it]==0){
                    sc.add(it);
                }
            }
        }
        if(i == numCourse){
            return topo;
        }
        int arr[]=new int[0];
        return arr;
    }
    public static void main(String args[]){
        int numCourse=2;
        int course[][]={{1,0}};
        int ans[]=course(numCourse, course);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
