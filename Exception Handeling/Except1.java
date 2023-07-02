class Except1
{
	public static void main(String [] args)
	{
	int a=4,b=0;
	System.out.println("A");
try
{
System.out.println(a/b);
}
catch(ArithmeticException e)
{
	System.out.println("Divide by 0 Can't Return");
}
System.out.println("B");
}
}