class Solution {
     public static int average(int arr[],int s,int e,int k)
        {
            int sum=0;
            int avg=0;
            for(int i=s;i<e;i++)
            {
                sum=sum+arr[i];
            }
            avg=sum/k;
         // System.out.println(s+" "+e);
         return avg;
        }
    public int numOfSubarrays(int[] arr, int k, int threshold) {
          
            int c=0;
             int a=0;
                a=average(arr,0,k,k);
                 if(threshold<=a)
                    c++;
            
         
           for(int i=k;i<arr.length;i++)
           {
               a=average(arr,i-k+1,i+1,k);
               // System.out.println(a);
                 if(threshold<=a)
                    c++;
           }
        return c;
    }
}