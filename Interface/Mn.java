import java.util.Scanner;
class Data
{
	protected int a,b;
	public void set(int x, int y)
	{
	a=x;
	b=y;
	}
}
interface IData
{
	abstract public void calc();
}
class Mn extends Data implements IData
{
public void calc()
{
System.out.println(a+b);
}
public static void main(String [] args)
{
Mn x = new Mn();
x.set(7,8);
x.calc();
}
}



