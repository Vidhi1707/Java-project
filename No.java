import java.util.Scanner;
class D3
{
protected int a;
public void set(int a)
{
this.a=a;
}
}
class No extends D3
{
public void check()
	{
	if(a%2==0)
	System.out.println("EVEN");
	else
	System.out.println("ODD");
	}
public static void main(String [] args)
{
No x = new No();
x.set(7);
x.check();
}
}

