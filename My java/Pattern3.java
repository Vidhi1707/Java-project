import java.util.Scanner;
class Pattern3{
public static void main(String [] args)
{
int i,j;
Scanner Sc = new Scanner(System.in);
for(i=1; i<=5; i=i+1)
{
	for(j=1; j<=i; j=j+1)
	{
	System.out.print(j%2);
	}
System.out.println();
}
}
}
