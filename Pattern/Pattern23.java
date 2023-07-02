import java.util.Scanner;
class Pattern23{
public static void main(String [] args)
{
int i,j;
Scanner Sc = new Scanner(System.in);
for(i=5; i>=1; i=i-1)
{
	for(j=1;j<=2*i-1;j=j+1)
{

	System.out.print(j);
}	
System.out.println();
}
}
}
