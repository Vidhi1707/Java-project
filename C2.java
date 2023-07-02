import java.util.Scanner;
class Constr
{
private int a,b;
Constr(int x, int y)
{
a=x;
b=y;
}
public int geta()
{
return a;
}
public int getb()
{
return b;
}
}
class C2
{
public static void main(String [] args)
{
Constr d = new Constr(4,5);
System.out.println(d.geta());
System.out.println(d.getb());
}
}
 