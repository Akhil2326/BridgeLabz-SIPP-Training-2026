import java.util.*;
public class PeakElement{
    static int peak(int[] arr){
        int l=0,r=arr.length-1;
        while(l<r){
            int m=l+(r-l)/2;
            if(arr[m]<arr[m+1]) l=m+1;
            else r=m;
        }
        return l;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int idx=peak(arr);
        System.out.println("Peak Index: "+idx);
        System.out.println("Peak Element: "+arr[idx]);
    }
}
