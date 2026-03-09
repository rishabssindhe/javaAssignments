package assignments.module6;
import java.util.*;
public class Subarraysum {
    public static void main(String[] a){
        int[] x={1,2,3,1,1,1,1};
        int k=3,s=0,m=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<x.length;i++){
            s+=x[i];
            if(s==k)m=i+1;
            if(h.containsKey(s-k))
                m=Math.max(m,i-h.get(s-k));
            if(!h.containsKey(s))h.put(s,i);
        }
        System.out.println(m);
    }
}
