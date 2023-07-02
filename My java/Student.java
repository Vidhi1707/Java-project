import java.util.Scanner;
class Student{
int roll;
String name;
float m1,m2,m3;
public static void main(String []args)
{
Float t,p;
Scanner Sc= new Scanner(System.in);
Student s= new Student();
System.out.println("Enter Roll no ,Name & Marks =   "); 
s.roll= Sc.nextInt();
s.name= Sc.next();
s.m1= Sc.nextFloat();
s.m2 = Sc.nextFloat();
s.m3 = Sc.nextFloat();
t=s.m1+s.m2+s.m3;
p=t*100/300;

System.out.println(p);

}
}