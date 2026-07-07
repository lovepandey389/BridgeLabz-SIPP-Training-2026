import java.util.*;
class Solution {
    public List<String> removeAnagrams(String[] words){
        List<String> ans=new ArrayList<>();
        String prev="";
        for(String w:words){
            char[] c=w.toCharArray();
            Arrays.sort(c);
            String s=new String(c);
            if(!s.equals(prev)){
                ans.add(w);
                prev=s;
            }
        }
        return ans;
    }
}