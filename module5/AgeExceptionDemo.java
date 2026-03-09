public class AgeExceptionDemo{
static void chk(int a){
if(a<18)throw new ArithmeticException("Age less than 18");
else System.out.println("Eligible");
}
public static void main(String[] b){
try{
chk(16);
}
catch(ArithmeticException e){
System.out.println(e.getMessage());
}
}
}
