import java.util.Scanner;
class Triangle{
public static void main(String[] args)
{
int a,b,c;
Scanner Sc = new Scanner(System.in);
System.out.println("Enter any 3 value" );
a= Sc.nextInt();
b= Sc.nextInt();
c= Sc.nextInt();
if (a==b&&b==c)
{
System.out.println("IT IS AN EQUILATERAL TRIANGLE");
}
else if (a==b||b==c||c==a)
{
System.out.println("IT IS AN ISOSCELES TRAINGLE");
}
else 
{
System.out.println("SCALENE TRIANGLE");
}
}
}