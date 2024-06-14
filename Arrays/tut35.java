// Merge two sorted array without extra space

public class tut35 {
    public static void merge(int[] nums1, int n, int[] nums2, int m) {
        int i=n-1; //last index of original nums1 array
        int j=m-1; //last index of nums2 array
        
        int k = m+n-1; 

        // last index of answer array( nums1 itself (including zeros)
        // in our case)
        while(i>=0&&j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
                k--;
            }
            else if(nums2[j]>=nums1[i]){
                nums1[k]=nums2[j];
                j--;
                k--;
            }
        }
        // while(i>=0){
        //     nums1[k]=nums1[i];
        //     k--;
        //     i--;
        // }
        while(j>=0){
            nums1[k]=nums2[j];
            k--;
            j--;
        }
    }
    public static void main(String args[]){
        int [] arr1 = {1,2,3,0,0,0};
        int [] arr2 = {2,5,6};
        int n = 3, m = 3;
        merge(arr1, n,arr2, m);
        System.out.println("The merged arrays are:");
        System.out.print("arr1[] = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("arr2[] = ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
}
