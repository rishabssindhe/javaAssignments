class A extends Thread{
public void run(){
System.out.println("Thread using Thread class");
}
}

class B implements Runnable{
public void run(){
System.out.println("Thread using Runnable interface");
}
}

public class ThreadDemo{
public static void main(String[] a){
A t1=new A();
t1.start();
B b=new B();
Thread t2=new Thread(b);
t2.start();
}
}
