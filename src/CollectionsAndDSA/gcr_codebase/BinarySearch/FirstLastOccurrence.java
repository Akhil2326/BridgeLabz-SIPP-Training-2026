import java.util.*;
public class FirstLastOccurrence{
    static int first(int[] a,int t){
        int l=0,r=a.length-1,ans=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(a[m]==t){ans=m;r=m-1;}
            else if(a[m]<t) l=m+1;
            else r=m-1;
        }
        return ans;
    }
    static int last(int[] a,int t){
        int l=0,r=a.length-1,ans=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(a[m]==t){ans=m;l=m+1;}
            else if(a[m]<t) l=m+1;
            else r=m-1;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int target=sc.nextInt();
        System.out.println("First: "+first(a,target));
        System.out.println("Last: "+last(a,target));
    }
}
