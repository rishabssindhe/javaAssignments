class A{
static int x=0;
A(){
x++;
}
static void show(){
System.out.println(x);
}
}

public class StaticDemo{
public static void main(String[] a){
A a1=new A();
A a2=new A();
A a3=new A();
A.show();
}
}
