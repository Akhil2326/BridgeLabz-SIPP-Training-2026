import java.util.*;
public class Scenario4_MinWindowSubstring {
    static String minWindowSubstring(String s,String t){
        if(s.isEmpty()||t.isEmpty()) return "";
        Map<Character,Integer> need=new HashMap<>(),win=new HashMap<>();
        for(char c:t.toCharArray()) need.put(c,need.getOrDefault(c,0)+1);
        int req=need.size(),formed=0,start=0,min=Integer.MAX_VALUE,idx=0;
        for(int end=0;end<s.length();end++){
            char c=s.charAt(end);
            win.put(c,win.getOrDefault(c,0)+1);
            if(need.containsKey(c)&&win.get(c).equals(need.get(c))) formed++;
            while(formed==req){
                if(end-start+1<min){min=end-start+1;idx=start;}
                char lc=s.charAt(start);
                win.put(lc,win.get(lc)-1);
                if(need.containsKey(lc)&&win.get(lc)<need.get(lc)) formed--;
                start++;
            }
        }
        return min==Integer.MAX_VALUE?"":s.substring(idx,idx+min);
    }
}
