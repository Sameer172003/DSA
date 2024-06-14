// Subarray with given XOR

import java.util.*;
public class tut32 {
    public static int subarraysXor(int arr[], int x) {
		// Write your code here.
		HashMap<Integer,Integer> map=new HashMap<>();
		int sum=0;
		int len=0;
		map.put(0,1);
		for(int i=0;i<arr.length;i++){
			sum=sum^arr[i];
			if(map.containsKey(sum^x)){
				len=len+map.get(sum^x);
			}
			map.put(sum,map.getOrDefault(sum,0)+1);
		}
		return len;
	}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(subarraysXor(arr, x));
        sc.close();
    }
}
