package assignments.module6;

public class RangeArray {
    public static void main(String[] args){
        int n=5;
        int[] d=new int[n];
        int l=1,r=3,v=5;
        d[l]+=v;
        if(r+1<n)d[r+1]-=v;
        for(int i=1;i<n;i++)d[i]+=d[i-1];
        for(int i:d)System.out.print(i+" ");
    }
}
