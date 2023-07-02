class Try
{
	public static void main(String []args)
{
		int a=4,b=0,c;
		int []x =new int[5];

try {
	System.out.println(x[2]/b);
	}
catch(ArithmeticException e)
{
	System.out.println("Divide by 0 NOT POSSIBLE");
}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("Invalid Ststement");
}
}
}

