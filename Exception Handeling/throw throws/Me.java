import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.sql.SQLException;
class Me //IOEXCEPTION
{
	public void show() throws IOException, FileNotFoundException, SQLException
	{
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter a Number =  ");
	int a;
	a= Sc.nextInt();
	if(a>0) throw new  IOException();
	else if(a<0) throw new FileNotFoundException();
	else throw new SQLException();
	} 
public static void main(String []args)
{
	Me m = new Me();

	try{
	m.show();
	}
	catch(FileNotFoundException e)
	{
	System.out.println("File Not Found");
	}
	catch(IOException e)
	{
	System.out.println("IO EXCEPTION");
	}
	catch(SQLException e)
	{
	System.out.println("SQL Exception");
	}
}
}
