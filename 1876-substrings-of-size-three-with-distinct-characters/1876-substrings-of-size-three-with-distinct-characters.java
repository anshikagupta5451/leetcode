class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        if(s.length()==0 || s.length()==1 || s.length()==2)
            return 0;
        if(s.charAt(0)!=s.charAt(1) && s.charAt(1)!=s.charAt(2) && s.charAt(0)!=s.charAt(2))
        {
            count++;
        }
        for(int i=2;i<s.length()-1;i++)
        {
     if(s.charAt(i-1)!=s.charAt(i) && s.charAt(i)!=s.charAt(i+1) && s.charAt(i-1)!=s.charAt(i+1))
             {
                 count++;
                 // System.out.println(s.charAt(i-1)+" "+s.charAt(i)+" "+s.charAt(i+1));
             }
        }
        return count;
    }
}