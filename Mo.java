import java.util.Scanner;
class D2{
private int a;
public void set(int x)
	{
	a=x;
	}
public int geta()
	{
	return a;
	}
}
class Mo{
public static void main(String [] args)
{
D2 d= new D2();
d.set(7);
System.out.println(d.geta());
}
}
