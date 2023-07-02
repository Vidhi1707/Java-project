import java.util.Scanner;
class For3{
public static void main(String [] args)
{
int i,j;
Scanner Sc = new Scanner(System.in);
for(i=1; i<=5; i=i+1)
{
	for(j=5; j>=i; j=j-1)
	{
	System.out.print(j);
	}
System.out.println();
}
}
}
