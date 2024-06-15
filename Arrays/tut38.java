// Find out how many times has an array been rotated

public class tut38 {
    public static int findKRotation(int arr[]) {
        int n=arr.length;
        int min=arr[0];
        for(int i =0;i<n;i++)
        {
            if(min>arr[i])
            {
                return i;
            }
        }
          return 0;
    }    
    public static void main(String args[]){
        int arr[]={5, 1, 2, 3, 4};
        System.out.println(findKRotation(arr));
    }
}
