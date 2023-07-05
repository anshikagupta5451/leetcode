// class Solution {
//     public int longestSubarray(int[] nums) {
//         int count=0;
//         int one=0;
//         int mc=0;
//         int max=0;
//         for(int i=0;i<nums.length;i++)
//         {
//             if(nums[i]==1)
//                 count++;
//         }
//         if(count==0)
//             return 0;
//         if(count==nums.length)
//             return nums.length-1;
//         for(int i=0;i<nums.length;i++)
//         {
//             if(nums[i]==0)
//                 mc++;
//             if(mc==1 || mc==0)
//             {
//                 one++;
//             }
//             if(mc==2)
//             {
//                 max=Math.max(max,one);
//                 mc=0;
//             }
//              max=Math.max(max,one);
//         }
//         return max;
//     }
// }
class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;

        int[] pre = new int[n];
        int[] suf = new int[n];

        pre[0] = nums[0];
        for (int i = 1; i < n; ++i) {
            pre[i] = nums[i] != 0 ? pre[i - 1] + 1 : 0; 
        }

        suf[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; --i) {
            suf[i] = nums[i] != 0 ? suf[i + 1] + 1 : 0;
        }

        int ans = 0;
        for (int i = 0; i < n; ++i) {
            int preSum = i == 0 ? 0 : pre[i - 1];
            int sufSum = i == n - 1 ? 0 : suf[i + 1];
            ans = Math.max(ans, preSum + sufSum);
        }

        return ans;
    }
}