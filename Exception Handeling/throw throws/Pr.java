import java.util.Scanner;
import java.io.IOException;
class Pr //Finally block
{
public static void main(String [] args)
	{
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter a Number =  ");
	int a,b;
	a= Sc.nextInt();
	b=Sc.nextInt();
	
	

	try
	{
	System.out.println(a/b);
	}
	catch(ArithmeticException e)
	{
	System.out.println("Can't Divide by 0");
	}
	finally
	{
	System.out.println("Finally Block");
	}
}
}
