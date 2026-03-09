class C{
int x=0;
synchronized void inc(){
x++;
}
}

class T extends Thread{
C c;
T(C c){this.c=c;}
public void run(){
for(int i=0;i<1000;i++)c.inc();
}
}

public class SyncDemo{
public static void main(String[] a){
C c=new C();
T t1=new T(c);
T t2=new T(c);
t1.start();
t2.start();
try{
t1.join();
t2.join();
}
catch(Exception e){}
System.out.println(c.x);
}
}
