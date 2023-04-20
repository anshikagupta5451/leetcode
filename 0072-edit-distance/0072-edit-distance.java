class Solution {
    public int minDistance(String word1, String word2) {  
        int memo[][] = new int[word1.length()+1][word2.length()+1];
        int ans  = memo(word1, word2, memo);
        return ans;
    } 
public static int memo(String s, String t, int arr[][]){
        if(s.length() == 0)
             return t.length();
        
        if(t.length() == 0)
             return s.length();
        
        if(arr[s.length()][t.length()] > 0)
             return arr[s.length()][t.length()];
       
        if(s.charAt(0)  == t.charAt(0)){  
            arr[s.length()][t.length()] = memo(s.substring(1), t.substring(1), arr);
            return memo(s.substring(1), t.substring(1), arr);
        }
        
        else{
            int replace =  memo(s.substring(1), t.substring(1), arr);
            int delete =  memo(s, t.substring(1), arr);
            int insert =  memo(s.substring(1), t, arr);
            
            arr[s.length()][t.length()] = 1 + Math.min(replace, Math.min(delete, insert));
            return 1 + Math.min(replace, Math.min(delete, insert));
        }  
    }
}