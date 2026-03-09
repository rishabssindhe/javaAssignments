package assignments.module6;

public class EvenIndex {
    public static void main(String[] a){
        int[] x={3,6,12,1,5,8};
        for(int i=0;i<x.length;i++){
            if(i%2==0&&x[i]%2!=0){
                for(int j=i+1;j<x.length;j++){
                    if(x[j]%2==0){
                        int t=x[i];
                        x[i]=x[j];
                        x[j]=t;
                        break;
                    }
                }
            }
        }
        for(int i:x)System.out.print(i+" ");
    }
}
