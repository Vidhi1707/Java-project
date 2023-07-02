import java.util.Scanner;
class Array2d{
public static void main(String [] args)
{
int [] [] x = new int [3] [2];
Scanner sc= new Scanner(System.in);
int i,j;
System.out.println("Enter  2 no =  ");
for(i=0;i<3;i++)
{
for(j=0;j<2;j++)
	{
	x[i][j]= sc.nextInt();
	}
}
for(i=0;i<3;i++)
{
for(j=0;j<2;j++)
	{
	System.out.print(x[i][j]);
	}
System.out.println();
}
}
}


