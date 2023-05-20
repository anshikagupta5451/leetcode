class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list  =new ArrayList<>();
        parenthsis(n,0,0,"",list);
        return list;
    }
    
    public static void parenthsis(int n,int opening, int closing, String ans,List<String> list)
        
    {   if(opening==n && closing==n)
    { list.add(ans);
         return;}
     
        if(opening<n)
        parenthsis(n,opening+1,closing,ans+"(",list);
     
        if(closing<opening)
        parenthsis(n,opening,closing+1,ans+")",list);
    }
      
}