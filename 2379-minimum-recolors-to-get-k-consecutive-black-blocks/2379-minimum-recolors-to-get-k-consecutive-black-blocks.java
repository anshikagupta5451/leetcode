class Solution {
    public int minimumRecolors(String s, int k) {
        int min=0;
        int c=0;
        for(int i=0;i<k;i++)
        {
            if(s.charAt(i)=='W')
                c++;
        }
        min=c;
        for(int i=k;i<s.length();i++)
        {
            if(s.charAt(i-k)=='W' && s.charAt(i)=='W')
            min=Math.min(c,min);
            else if(s.charAt(i-k)=='W' && s.charAt(i)=='B')
            {
            c--;
                min=Math.min(c,min);
            }
            else if(s.charAt(i-k)=='B' && s.charAt(i)=='W')
            {
            c++;
                min=Math.min(c,min);
            }
        }
        return min;
    }
}