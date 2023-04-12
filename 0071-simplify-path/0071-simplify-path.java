class Solution{
public String simplifyPath(String path) {
        final String[] sArray = path.split("/");
        final Stack<String> stack = new Stack<>();
        for(String s: sArray) {
            if("..".equals(s)) {
                if(!stack.isEmpty()) stack.pop();
            } else if(!"".equals(s) && !".".equals(s)) {
                stack.push("/" + new StringBuilder(s).reverse().toString());
            } 
        }

        if(stack.isEmpty()) return "/";
        
        final StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) sb.append(stack.pop());

        return sb.append("/").reverse().deleteCharAt(sb.length() - 1).toString();
 }
}