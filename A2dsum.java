import java.util.Scanner;
class A2dsum{
public static void main(String [] args)
{
int [] [] x = new int [3] [3];
Scanner sc= new Scanner(System.in);
int i,j,s=0;
System.out.println("Enter  9 no =  ");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
	{
	x[i][j]= sc.nextInt();
	}
}

System.out.println("Matrix");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
	{
	System.out.print(x[i][j]);
	}
System.out.println();
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
	{
	s=s+x[i][j];
	}

System.out.println(s);
s=0;


}
}

}

