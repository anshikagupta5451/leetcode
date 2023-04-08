class Solution {
    public boolean isValid(String si) {
        Stack<Character> st=new Stack<>();
        char s[]=si.toCharArray();
        if(s.length==1)
            return false;
        if(s.length == 0){
            return true;
        }
        int i=0;

        while(i < s.length){
            if( s[i] == '(' || s[i] == '[' || s[i] == '{' ){
                st.push(s[i]);
            }
            else if ( (s[i] == ')' && !st.empty() && st.peek() == '(') ||
                        (s[i] == '}' && !st.empty() && st.peek() == '{') ||
                        (s[i] == ']' && !st.empty() && st.peek() == '[')
                      ){
                st.pop();
            }
            else {
                return false;    
            }
            i++;
        }
        // If stack.empty(), return true...
        if(st.empty()) {
            return true;
        }
        return false;
  
    }
}