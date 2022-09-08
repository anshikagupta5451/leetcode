class Solution {
    public String reverseWords(String s) {
        s.trim();
        String[] si=s.split("\s+");
        String res="";
        String sp="";
        for(int i=si.length-1;i>=0;i--)
        {  
            res=res+si[i]+" ";
        }
        
        //System.out.print(si.length);
        return res.trim();
    }
}