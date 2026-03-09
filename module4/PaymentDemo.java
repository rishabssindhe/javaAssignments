interface Payment{
void pay();
}

class CreditCardPayment implements Payment{
public void pay(){
System.out.println("Credit Card Payment Done");
}
}

class UPIPayment implements Payment{
public void pay(){
System.out.println("UPI Payment Done");
}
}

public class PaymentDemo{
public static void main(String[] a){
Payment p1=new CreditCardPayment();
Payment p2=new UPIPayment();
p1.pay();
p2.pay();
}
}
