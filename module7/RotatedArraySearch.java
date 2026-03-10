package assignments.module7;

public class RotatedArraySearch{
    static int s(int[] x,int k){
        int l=0,h=x.length-1;
        while(l<=h){
            int m=(l+h)/2;
            if(x[m]==k)return m;
            if(x[l]<=x[m]){
                if(k>=x[l]&&k<x[m])h=m-1;
                else l=m+1;
            }else{
                if(k>x[m]&&k<=x[h])l=m+1;
                else h=m-1;
            }
        }
        return -1;
    }

    public static void main(String[] a){
        int[] x={4,5,6,7,0,1,2};
        System.out.println(s(x,0));
    }
}