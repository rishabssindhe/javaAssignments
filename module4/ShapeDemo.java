abstract class Shape{
abstract double area();
}

class Circle extends Shape{
double r;
Circle(double r){this.r=r;}
double area(){return 3.14*r*r;}
}

class Rectangle extends Shape{
double l,b;
Rectangle(double l,double b){this.l=l;this.b=b;}
double area(){return l*b;}
}

public class ShapeDemo{
public static void main(String[] a){
Circle c=new Circle(5);
Rectangle r=new Rectangle(4,6);
System.out.println(c.area());
System.out.println(r.area());
}
}
