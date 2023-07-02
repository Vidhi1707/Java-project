abstract class M
{
	protected int a,b;
	public void set(int a,int b)
	{
	this.a = a;
	this.b = b;
	}
abstract public void calc();
}
class N extends M
{
	public void calc()
	{
	System.out.println(a+b);
	}
public static void main(String [] args)
{
	N k = new N();
	k.set(7,8);
	k.calc(); 
}
}
