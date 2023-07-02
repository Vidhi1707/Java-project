import java.util.Scanner;
class Pattern2{
public static void main(String [] args)
{
int i,j;
Scanner Sc = new Scanner(System.in);
for(i=1; i<=5; i=i+1)
{
	for(j=i; j>=1; j=j-1)
	{
	System.out.print(j);
	}
System.out.println();
}
}
}
