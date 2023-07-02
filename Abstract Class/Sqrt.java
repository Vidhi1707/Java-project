import java.lang.*;
abstract class Shape
{
	protected int a;
	public void set(int a)
	{
	this.a=a;
	}
abstract public void calc();
}
class Cube extends Shape
{
	public void calc()
	{
	System.out.println(a*a*a);
	}
}
class Square extends Shape
{
	public void calc()
	{
System.out.println(a*a);
	}
} 
class Sqrt extends Shape
{
	public void calc()
	{
	System.out.println(Math.sqrt(a));
	}
public static void main(String [] args)
{
	Square s = new Square();
	Sqrt sq = new Sqrt();
	Cube c = new Cube();
	s.set(7);
	sq.set(3);
	c.set(2);
	s.calc();
	sq.calc();
	c.calc(); 
}
}
