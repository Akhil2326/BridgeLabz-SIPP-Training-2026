import java.util.*;
public class Scenario2_Triplets {
    static List<List<Integer>> findTriplets(int[] a,int target){
        Arrays.sort(a);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<a.length-2;i++){
            if(i>0&&a[i]==a[i-1]) continue;
            int l=i+1,r=a.length-1;
            while(l<r){
                int s=a[i]+a[l]+a[r];
                if(s==target){
                    ans.add(Arrays.asList(a[i],a[l],a[r]));
                    while(l<r&&a[l]==a[l+1]) l++;
                    while(l<r&&a[r]==a[r-1]) r--;
                    l++; r--;
                }else if(s<target) l++; else r--;
            }
        }
        return ans;
    }
}
