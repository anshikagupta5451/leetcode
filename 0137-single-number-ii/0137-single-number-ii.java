class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<32;i++)
        {
           int cntbit=0;
            for(int x:nums)
            {
                if(((1)&(x>>i))==1)
                    cntbit++;
                    cntbit%=3;
            }
                   if(cntbit!=0)
                   ans|=cntbit<<i;
        }
     return ans;
    }
}