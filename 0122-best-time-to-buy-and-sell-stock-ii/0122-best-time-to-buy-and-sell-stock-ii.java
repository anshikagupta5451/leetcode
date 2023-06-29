class Solution {
    public int maxProfit(int[] arr) {
        int n=arr.length;
        int ans=0;
        for(int i=1;i<n;i++)
         if(arr[i] > arr[i-1]){
                ans += arr[i]-arr[i-1];
            }
        return ans;
    }
//     public int profit1(int[] arr)
//     {
//         int mi=arr[0];
//         int d=0;
//         for(int i=1;i<arr.length;i++)
//         {
//             mi=Math.min(arr[i],mi);
//             d=Math.max(arr[i]-mi,d);
//         }
//         return d;
//     }
//     public int maxProfit(int[] arr) {
        
//         int arr1[]=new int[arr.length];
//           arr1[0]=0;
//         for(int i=1;i<arr.length;i++)
//         {
//             if(arr[i-1]<arr[i])
//                 arr1[i]=arr[i]-arr[i-1];
//             else
//                 arr1[i]=0;
//             // System.out.print(arr1[i]+" ");
            
//         }
//         Arrays.sort(arr1);
//         int sum=arr1[arr1.length-1]+arr1[arr1.length-2];
//         if(profit1(arr)>sum)
//             return profit1(arr);
//         else
//             return sum;
        
//     }
}