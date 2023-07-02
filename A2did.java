import java.util.Scanner;
class A2did{
public static void main(String [] args)
{
int [] [] x = new int [3] [3];
Scanner sc = new Scanner(System.in);
int i,j;
int c=0;
System.out.println("Enter 9 no = ");
	for(i=0;i<3;i++)
	{
	for(j=0;j<3;j++)
	{
		{
		x[i][j]= sc.nextInt();
		}
	}
	}
		System.out.println("MATRIX");
	for(i=0;i<3;i++)
	{
	for(j=0;j<3;j++)
	{
   		if(x[i][j]==x[j][i])
		{
		c=c+1;
		}
	System.out.print(x[i][j]);
	}
	System.out.println();
	}
	if(c==9)
	{
	System.out.println("IDENTICAL MATRIX");
	}
	else
	{
	System.out.println("NOT IDENTICAL");
	}

}
}