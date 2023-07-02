import java.util.Scanner;
class Nested2{
public static void main(String[] args)
{
int a,b,c,s;
Scanner Sc = new Scanner(System.in);
System.out.println("Enter any value = ");
a=Sc.nextInt();
b=Sc.nextInt();
c=Sc.nextInt();
if(a>b&&a>c)
{
if (b>c)
{
System.out.println("B is Greater");
}
else
{
System.out.println("C is Greater");
}
}
else if (b>a&&b>c)
{
if (a>c)
{
System.out.println("A is Greater");
}
else
{
System.out.println("C is Greater"); 
}
}
else if (c>a&&c>b)
{
if (a>b)
{
System.out.println("A is Greater");
}
else
{
System.out.println("B is Greater");
}
}
}
}