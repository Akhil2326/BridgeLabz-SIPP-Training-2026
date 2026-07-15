import java.util.*;
public class RotationPoint{
    static int findRotation(int[] arr){
        int l=0,r=arr.length-1;
        while(l<r){
            int m=l+(r-l)/2;
            if(arr[m]>arr[r]) l=m+1;
            else r=m;
        }
        return l;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int idx=findRotation(arr);
        System.out.println("Rotation Index: "+idx);
        System.out.println("Minimum Element: "+arr[idx]);
    }
}
