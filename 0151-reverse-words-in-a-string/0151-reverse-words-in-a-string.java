class Solution {
    public String reverseWords(String s) {
        s.trim();
        System.out.println(s);
        String st="";
        String c[]=s.split("\s+");
        for(int i=c.length-1;i>=0;i--)
        {   
             c[i].trim();
             st=st+c[i]+" ";
        }
   return st.trim();
        
    }
}