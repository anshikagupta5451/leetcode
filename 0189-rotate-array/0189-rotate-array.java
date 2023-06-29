class Solution {
     public static void reverse(int arr[],int s, int e)
        {
            while(s<e)
            {   int temp=arr[s];
             arr[s]=arr[e];
             arr[e]=temp;
                // Math.swap(arr[s],arr[e]);
                s++;
                e--;
            }
        }
    public void rotate(int[] nums, int k) {
        int x=k%nums.length;
        reverse(nums,0,nums.length-x-1);
        reverse(nums,nums.length-x,nums.length-1);
        reverse(nums,0,nums.length-1);
    }
}