public class GCDemo{
public void finalize(){
System.out.println("Object collected");
}
public static void main(String[] a){
GCDemo g1=new GCDemo();
GCDemo g2=new GCDemo();
g1=null;
g2=null;
System.gc();
}
}
