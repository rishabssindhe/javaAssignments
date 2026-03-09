class T extends Thread{
public void run(){
try{
Thread.sleep(500);
}
catch(Exception e){}
System.out.println("Running");
}
}

public class ThreadLifeCycleDemo{
public static void main(String[] a)throws Exception{
T t=new T();
System.out.println(t.getState());
t.start();
System.out.println(t.getState());
t.join();
System.out.println(t.getState());
}
}
