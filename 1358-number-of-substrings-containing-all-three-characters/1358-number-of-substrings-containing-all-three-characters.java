class Solution {
    public int numberOfSubstrings(String s) {
        
        int start=0;
        int c=0;
        int length=s.length();
        int freq[]=new int[3];
        for(int e=0;e<length;e++){
            
            freq[s.charAt(e)-97]++;
            while(freq[0]!=0 && freq[1]!=0 && freq[2]!=0){
                 c+=length-e;
               freq[s.charAt(start++)-97]--;
                
                
            }
        }
        return c;
    }
}