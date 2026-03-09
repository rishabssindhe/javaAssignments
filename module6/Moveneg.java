package assignments.module6;

public class Moveneg {
    public static void main(String[] a){
        int[] x={-1,2,-3,4,-5,6};
        int j=0;
        for(int i=0;i<x.length;i++){
            if(x[i]<0){
                int t=x[i];
                x[i]=x[j];
                x[j]=t;
                j++;
            }
        }
        for(int i:x)System.out.print(i+" ");
    }
}
