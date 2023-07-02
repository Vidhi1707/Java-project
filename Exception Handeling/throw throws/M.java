import java.util.Scanner;
class M
{
public void show()
{
	Scanner Sc=new Scanner(System.in);
	int a;
	System.out.println("Enter a NUMBER = ");
	a= Sc.nextInt();
	if(a>0)
	{
	throw new ArithmeticException();
	}
	else if(a<0)
	{
	throw new ArrayIndexOutOfBoundsException();
	}
	else
	{
	throw new NumberFormatException();
	}
}
	public static void main(String []args)
	{
	M x=new M();
	x.show(); 
	}
}
