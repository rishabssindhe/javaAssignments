package assignments.module6;

public class AllPairSum {
    public static void main(String[] args) {
        int[] x={1,5,7,-1,5};
        int t=6;
        for(int i=0;i<x.length;i++)
            for(int j=i+1;j<x.length;j++)
                if(x[i]+x[j]==t)
                    System.out.println(x[i]+" "+x[j]);

    }

}
