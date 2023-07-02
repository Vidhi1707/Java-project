import java.util.Scanner;
abstract class Input
{
	protected int a ;int b;
	public void set(int a, int b)
	{
	this.a = a;
	this.b = b;
	}
abstract public void calc();
}
class Prime extends Input
{
	public void calc()
	{
	int c=0;
	for(a=1;b<a;a++)
	{
		if(b%a ==0)
		{
		c++;
		}
	}
	if(c==0)
	{
	System.out.println("Prime NO");
	}
	else
	{
	System.out.println(" Not Prime NO");
	}
	} 
}

class Even extends Input
{
	public void calc()
	{
	int i,s=0;
	for(i=a;i<=b;i=i+1)
	{
	if(i%2==0)
		{
		s=s+i;
		}
	}
	System.out.println("SUM OF EVEN NO IS  "+s);

	}
}
	class Palindrome extends Input
	{
		public void calc()
		{
			int m,b1,r=0;
			m=a;
			
			while(a!=0)
			{
				b1=a%10;
				r=r*10+b1;
				a=a/10;
			}
			
			System.out.println(r);
			if(r==m)
			{
				System.out.println("Palindrome");
			}
			else 
			{
				System.out.println("Not a Palindrome");
			}
			r=0;
			m=b;
			while(b!=0)
			{
				b1=b%10;
				r=r*10+b1;
				b=b/10;
			}
			
			System.out.println(r);
			if(r==m)
			{
				System.out.println("Palindrome");
			}
			else 
			{
				System.out.println("Not a Palindrome");
			}
			
		}
		public static void main(String [] args)
		{
			Palindrome p =new Palindrome();
			Even e = new Even();
			Prime pr= new Prime();
			pr.set(8,10);
			e.set(2,10);
			p.set(11,21);
			pr.calc();
			e.calc();
			p.calc();
		}
	}	

