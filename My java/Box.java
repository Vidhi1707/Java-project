import java.util.Scanner;
class Box{
public static void main(String [] args)
{
int i,j;
Scanner Sc = new Scanner(System.in);
for(i=1; i<=5; i=i+1)
{
	for(j=1; j<=5; j=j+1)
	{
if(i==1||i==5||j==1||j==5)
	{	
	System.out.print("*");
	}
else
	{
	System.out.print(" ");
	
}
}
System.out.println();
	
}
}
}

