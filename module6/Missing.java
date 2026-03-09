package assignments.module6;

public class Missing {
    public static void main(String[] a){
        int[] x={1,2,4,5};
        int n=5;
        int s=n*(n+1)/2;
        for(int i:x)s-=i;
        System.out.println(s);
    }
}
