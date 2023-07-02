import java.util.Scanner;
class Pattern13{
public static void main(String [] args)
{
int c=1,i,j;
Scanner Sc = new Scanner(System.in);
for(i=1; i<=5; i=i+1)
{
	for(j=5;j>=i;j=j-1)
{

	System.out.print(c);
	c=c+1;
}	
System.out.println();
}
}
}
