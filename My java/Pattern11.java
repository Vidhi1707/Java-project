import java.util.Scanner;
class Pattern11{
public static void main(String [] args)
{
int i,j;
Scanner Sc = new Scanner(System.in);
for(i=5; i>=1; i=i-1)
{
	for(j=5;j>=i;j=j-1)
{

	System.out.print(i);
}	
System.out.println();
}
}
}
