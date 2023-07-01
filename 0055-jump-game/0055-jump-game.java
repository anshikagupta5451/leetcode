class Solution {
    public boolean canJump(int[] nums) {
        int cm=0;
        int c=0;
        for(int i=0;i<nums.length-1;i++)
        {
            cm=Math.max(cm,nums[i]+i);
                if(c==i)
                    c=cm;
            if(cm>=nums.length-1)
                return true;
            if(c==i && nums[c]==0)
                return false;
        }
        return true;
    }}