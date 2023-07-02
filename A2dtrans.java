import java.util.Scanner;
class A2dtrans{
public static void main(String [] args)
{
int [] [] x = new int [3] [3];
Scanner sc= new Scanner(System.in);
int i,j;
System.out.println("Enter  9 no =  ");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
	{
	x[i][j]= sc.nextInt();
	}
}
System.out.println("MATRIX");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
	{
	System.out.print(x[i][j]);
	}
System.out.println();
}

System.out.println("TRANSPOSE MATRIX");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
	{
	System.out.print(x[j][i]);
	}
System.out.println();
}
}
}


