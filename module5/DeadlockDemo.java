class A{}
class B{}

public class DeadlockDemo{
public static void main(String[] a){
A a1=new A();
B b1=new B();

Thread t1=new Thread(){
public void run(){
synchronized(a1){
System.out.println("Thread1 locked A");
try{Thread.sleep(100);}catch(Exception e){}
synchronized(b1){
System.out.println("Thread1 locked B");
}
}
}
};

Thread t2=new Thread(){
public void run(){
synchronized(b1){
System.out.println("Thread2 locked B");
try{Thread.sleep(100);}catch(Exception e){}
synchronized(a1){
System.out.println("Thread2 locked A");
}
}
}
};

t1.start();
t2.start();
}
}
