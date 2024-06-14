// 3 Sum

import java.util.*;
public class tut29 {
    public static void display(List<List<Integer>> arr){
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.get(0).size();j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<n;i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    List<Integer>temp=Arrays.asList(nums[i], nums[j],nums[k]);
                    ans.add(temp);
                    j++;
                    k--;

                    while(j<k && nums[j] == nums[j-1]){
                        j++;
                    }
                    while(j<k && nums[k] == nums[k+1]){
                        k--;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List<List<Integer>> ans=new ArrayList<>();
        ans.addAll(threeSum(arr));
        display(ans);
        sc.close();
    }
}
