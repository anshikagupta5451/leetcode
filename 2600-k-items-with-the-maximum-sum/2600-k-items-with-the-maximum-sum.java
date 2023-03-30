class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(numOnes>=k)
            return k;
        else
        {
            int a=k-numOnes;
             if(numZeros>=a)
                return numOnes;
        
             else
             {
               k=k-numZeros;
               k=k-numOnes;
               // System.out.println("a");
              return numOnes-k;
              
            }
        }
    }
}