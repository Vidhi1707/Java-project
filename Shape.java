import java.util.Scanner;
class Shape{
int r,b,h;
long s,l,B;

void area(int r)
{
float a;
a=3.14f*r*r;
System.out.println("Area of Circle = "+a);
}
void area(long s)
{
float a;
a=s*s;
System.out.println("Area of Square = "+a);
}
void area(int b,int h)
{
float a;
a=0.5f*b*h;
System.out.println("Area of Triangle = "+a);
}
void area(long l,long B)
{
long a;
a=l*B;
System.out.println("Area of Rectangle = "+a);
}

public static void main(String[] args)
{
Shape s= new Shape();
Scanner Sc = new Scanner(System.in);
System.out.println("Enter Radius =  ");
s.area(Sc.nextInt());
System.out.println("Enter value For Square= ");
s.area(Sc.nextLong());
System.out.println("Enter value For Triangle= ");
s.area(Sc.nextInt(),Sc.nextInt());
System.out.println("Enter value For Rectangle= ");
s.area(Sc.nextLong(),Sc.nextLong());
}
}