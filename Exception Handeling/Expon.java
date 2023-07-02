class Expon{
public static void main(String [] args)
{
int a=4,b=0;
int []x= new int[5];
try{
	
	try{
		System.out.println(a/b);
		}

	catch(ArithmeticException e)
	{
		System.out.println("Divide by 0 Not Possible");
	}
	System.out.println(x[7]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	 System.out.println("Invalid Statement");
	}
	}
	}