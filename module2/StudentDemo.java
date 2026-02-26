import java.util.Scanner;

class Student {
    String n;
    int a;

    Student() {
        n="Rishab";
        a=20;
    }

    Student(String name,int age) {
        n=name;
        a=age;
    }

    void display() {
        System.out.println("Name: "+n+", Age: "+a);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1=new Student();       
        Student s2=new Student("Rishab S Sindhe",20);
        System.out.print("Student 1 (Default): ");
        s1.display();
        System.out.print("Student 2 (Parameterized): ");
        s2.display();

        sc.close();
    }
}
