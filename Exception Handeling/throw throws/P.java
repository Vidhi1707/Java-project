import java.io.IOException;
class P
{
	public void show() throws IOException
	{
	throw new IOException();
	}
	public static void main(String []args)
	{
	P pi = new P();
	try
	{
	pi.show();
	}
	catch(IOException e)
	{
		System.out.println("Exception");
	}
	}
}