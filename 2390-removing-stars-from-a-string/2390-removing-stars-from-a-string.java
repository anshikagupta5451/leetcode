class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='*')
               
            {
                st.push(s.charAt(i));
               
            }
            else if(s.charAt(i)=='*')
            {
                 char x =st.pop();
                
            } 
        }
        String a="";
        int y=st.size();
        for(int i=0;i<y;i++)
        {
            char at=st.pop();
            a=at+a;
        }
        
            return a;
    }
}