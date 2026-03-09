package assignments.module6;
import java.util.*;
public class TwoSumOpt {
    public static void main(String[] args){
        int[] x={2,7,11,15};
        int t=9;
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<x.length;i++){
            int y=t-x[i];
            if(m.containsKey(y)){
                System.out.println(m.get(y)+" "+i);
                return;
            }
            m.put(x[i],i);
        }
    }
}
