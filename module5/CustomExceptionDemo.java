class MyEx extends Exception{
MyEx(String s){
super(s);
}
}

public class CustomExceptionDemo{
static void chk(int a)throws MyEx{
if(a<18)throw new MyEx("Not eligible");
else System.out.println("Eligible");
}

public static void main(String[] a){
try{
chk(16);
}
catch(MyEx e){
System.out.println(e.getMessage());
}
}
}
