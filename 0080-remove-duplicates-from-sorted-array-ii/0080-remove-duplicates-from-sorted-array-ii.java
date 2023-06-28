class Solution {
    public int removeDuplicates(int[] nums) {
      int count=1;
      int k=2;
        int oc=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
                oc++;
            else
                oc=1;
            
            if(oc<=k)
            { nums[count]=nums[i];
               count++;
             }
            
        }
        return count;
    }
}