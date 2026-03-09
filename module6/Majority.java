package assignments.module6;

public class Majority {
    public static void main(String[] a){
        int[] x={2,2,1,1,2,2,2};
        int c=0,m=0;
        for(int i:x){
            if(c==0)m=i;
            if(i==m)c++;
            else c--;
        }
        System.out.println(m);
    }
}
