package OOPS;
import java.util.Scanner;

public class studentClass {
    //creating a data type
    public static class Student{
        String name;
        int rno;
        double percent;
    }
    public static void main(String[] args) {
Student x = new Student();
x.name = "ram";
x.rno = 1;
x.percent =92.5;
System.out.println(x.name);
    }
    Scanner sc = new scanner(System.in);
    int x = sc.nexInt();

}
