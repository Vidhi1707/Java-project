import java.util.Scanner;
class Circle
{
protected int r;
public void set(int r)
{
this.r = r;
}
public void calc()
{
System.out.println("Area of circle ");
System.out.println(3.14*r*r);
}
}
class Square extends Circle
{
public void calc()
{
super.calc();
System.out.println("Area of Square");
System.out.println(r*r);
}
public static void main(String [] args)
{
Square s = new Square();
s.set(7);
s.calc();
}
}