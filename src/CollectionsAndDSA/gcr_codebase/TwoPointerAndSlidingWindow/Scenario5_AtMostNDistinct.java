import java.util.*;
public class Scenario5_AtMostNDistinct {
    static int longestSubarrayWithAtMostNDistinct(int[] a,int n){
        Map<Integer,Integer> map=new HashMap<>();
        int start=0,max=0;
        for(int end=0;end<a.length;end++){
            map.put(a[end],map.getOrDefault(a[end],0)+1);
            while(map.size()>n){
                map.put(a[start],map.get(a[start])-1);
                if(map.get(a[start])==0) map.remove(a[start]);
                start++;
            }
            max=Math.max(max,end-start+1);
        }
        return max;
    }
}
