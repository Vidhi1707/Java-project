import java.util.Scanner;
class M2
{
	M2()
	{
	System.out.println("DM");
	}
	M2(int a)
	{
	System.out.println("1M");
	}
	M2(int a, int b)
	{
	System.out.println("2M");
	}
}
class N2 extends M2
{
	N2()
	{
	System.out.println("DN");
	}
	N2(int a)
	{
	System.out.println("D1");
	}
	N2(int a, int b)
	{
	System.out.println("D2");
	}
public static void main(String [] args)
{
	N2 x = new N2();
	N2 y = new N2(8); 
}
}