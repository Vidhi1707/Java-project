import java.util.Scanner;
class T1
{

	T1()
	{
		System.out.println("T1");
	}
	T1(int a )
	{
		System.out.println("1T1");
	}
	
	T1(int a,int b)
	{
	System.out.println("2T1");
	}
}
class T2 extends T1
{
	T2()
	{
		System.out.println("D2");
	}
	T2(int a)
	{
		super(7,4);
		System.out.println("1D2");
	}
	T2(int a , int b)
	{
		System.out.println("2D2");
	}
}
class T3 extends T2
{
	T3()
	{
		System.out.println("T3");
	}
	T3(int a)
	{
		System.out.println("1T3");
	}
	T3(int a,int b)
	{
		System.out.println("2T3");
	}
}
class Inn
{
public static void main(String [] args)
{
	T3 t = new T3(8,9);
	
}
}