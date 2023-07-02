
import java.util.Scanner;
class D1
{
	protected int a,b;
	public void set(int a,int b)
	{
	this.a=a;
	this.b=b;
	}
	public void cal()
	{
		System.out.println("SUM= " +(a+b));
	}
}
class D2 extends D1
{
	public void cal()
	{
	super.cal();
	if(a>b)
	{
		System.out.println("GREATEST = "+a);
	}
	else
	{
	System.out.println("GREATEST = "+b);
	}
	}
}
class D3 extends D2
{
	public void cal()
	{
	int n=0,i,c=0;
	super.cal();
	for(i=a;i<=b;i++)
	{
		if(n%2==0)
		{
			c++;
		}
	}
	if(c==0)
	{
		System.out.println("EVEN NUMBER is " +i);
	}
	else
	{
	System.out.println( "ODD NUMBER is " +i);
	}
	}
}
class Input6
{
	public static void main(String [] args)
	{
	D3 d=new D3();
	d.set(10,20);
	d.cal();
	}
}
