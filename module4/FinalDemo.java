final class A{
final int x=10;
final void show(){
System.out.println(x);
}
}

class B{
final int y=20;
final void disp(){
System.out.println(y);
}
}

public class FinalDemo{
public static void main(String[] a){
A a1=new A();
a1.show();
B b=new B();
b.disp();
}
}
