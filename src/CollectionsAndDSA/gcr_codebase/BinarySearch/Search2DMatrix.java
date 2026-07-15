import java.util.*;
public class Search2DMatrix{
    static boolean search(int[][] mat,int target){
        int rows=mat.length, cols=mat[0].length;
        int l=0,r=rows*cols-1;
        while(l<=r){
            int m=l+(r-l)/2;
            int val=mat[m/cols][m%cols];
            if(val==target) return true;
            if(val<target) l=m+1;
            else r=m-1;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt(), c=sc.nextInt();
        int[][] mat=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                mat[i][j]=sc.nextInt();
        int target=sc.nextInt();
        System.out.println(search(mat,target));
    }
}
