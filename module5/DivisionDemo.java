public class DivisionDemo{
public static void main(String[] a){
int x=10,y=0;
try{
int z=x/y;
System.out.println(z);
}
catch(ArithmeticException e){
System.out.println("Division by zero");
}
finally{
System.out.println("Finally block executed");
}
}
}
