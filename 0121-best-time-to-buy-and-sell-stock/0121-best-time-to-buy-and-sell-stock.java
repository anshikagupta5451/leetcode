class Solution {
    public int maxProfit(int[] arr) {
        int mi=arr[0];
        int d=0;
        for(int i=1;i<arr.length;i++)
        {
            mi=Math.min(mi,arr[i]);
            d=Math.max(arr[i]-mi,d);
        }
        // System.out.println(mi);
        if(d>0)
            return d;
        else
            return 0;
        
    }
}