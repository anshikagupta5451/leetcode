class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] st=s.toCharArray();
        char[] tt=t.toCharArray();
        int x=0;
        int y=0;
        int c=0;
        if(st.length==0)
            return true;
        if(tt.length==0)
            return false;
        while(tt.length>x)
        {
            if(st[y]==tt[x])
            {
                y++;
                x++;
                c++;
            }
            else
                x++;
            if(c==st.length)
                return true;
        }
        return false;
        
        
    }
}