import java.util.Scanner;
class Stood
{
int roll;
String name;
Float m1,m2,m3;
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
Stood s1 = new Stood();
Stood s2 = new Stood();
Stood s3 = new Stood();
System.out.println("Enter ROLL NO, NAME AND MARKS = ");
s1.roll= sc.nextInt();
s1.name= sc.next();
s1.m1=sc.nextFloat();
s1.m2=sc.nextFloat();
s1.m3=sc.nextFloat();

s2.roll= sc.nextInt();
s2.name= sc.next();
s2.m1=sc.nextFloat();
s2.m2=sc.nextFloat();
s2.m3=sc.nextFloat();

s3.roll= sc.nextInt();
s3.name= sc.next();
s3.m1=sc.nextFloat();
s3.m2=sc.nextFloat();
s3.m3=sc.nextFloat();

Float t1,t2,t3;
t1=s1.m1+s1.m2+s1.m3;
t2=s2.m1+s2.m2+s3.m3;
t3=s3.m1+s3.m2+s3.m3;

if(t1>t2 &&t1>t3)
{
System.out.println("HIGHEST MARKS OBTAINED BY "+s1.name);
}
if(t2>t1 &&t2>t3)
{
System.out.println("HIGHEST MARKS OBTAINED BY "+s2.name);
}
if(t3>t2 &&t3>t1)
{
System.out.println("HIGHEST MARKS OBTAINED BY "+s3.name);
}
}
}