import java.util.Scanner;
class Emp
{
int id;
String name;
Float salary;
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
Emp e1 = new Emp();
Emp e2 = new Emp();
Emp e3 = new Emp();
System.out.println("Enter id,Name,Salary =  ");
e1.id = sc.nextInt();
e1.name = sc.next();
e1.salary = sc.nextFloat();

e2.id = sc.nextInt();
e2.name = sc.next();
e2.salary= sc.nextFloat();

e3.id = sc.nextInt();
e3.name = sc.next();
e3.salary = sc.nextFloat();

Float t;
t=e1.salary+e2.salary+e3.salary;
{
System.out.println("Total Salary = " +t);
}
}
}

