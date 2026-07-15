import java.util.*;
public class Scenario1_PairSum {
    static int[] findPairSum(int[] a,int target){
        int l=0,r=a.length-1;
        while(l<r){
            int sum=a[l]+a[r];
            if(sum==target) return new int[]{a[l],a[r]};
            if(sum<target) l++; else r--;
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(findPairSum(new int[]{1,2,3,4,6},6)));
    }
}
