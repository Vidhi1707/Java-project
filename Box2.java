import java.util.Scanner;
class Box2{
public static void main(String [] args)
{
int i,j;
Scanner Sc = new Scanner(System.in);
for(i=1; i<=5; i=i+1)
{
	for(j=i; j<=2*i; j=j+1)
	{
if(j%2)
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

