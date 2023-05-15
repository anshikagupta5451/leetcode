class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int freq[]=new int[k];
        int sum=0;
        freq[0]=1;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            int x=(sum%k);
            if(x<0)
                x+=k;
            freq[x]++;
        }
        int ans=0;
        for(int i=0;i<k;i++)
        {
            if(freq[i]>=2)
                ans=ans+((freq[i]-1)*freq[i])/2;
                
        }
        return ans;
    }
}