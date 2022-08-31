
        class Solution {
    public int removeElement(int[] nums, int val) {
      // int c=0;
        int l=-1;
        
        for(int i=0;i<nums.length;i++)
        {
           if (nums[i]!=val)
             nums[++l]=nums[i]; 
        }
        return l+1;
    }
}