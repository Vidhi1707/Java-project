import java.util.Scanner;
class Array2{
public static void main(String [] args)
{
int []a = new int [5];
Scanner Sc = new Scanner(System.in);
int m,i;
System.out.println("Enter any 5 no =  ");
for(i=0;i<a.length;i++)
{
a[i] = Sc.nextInt();
}
m= a[0];
for(i=0;i<a.length;i++)
{
if(a[i]>m)
	{
	m=a[i];
	}
}
System.out.println(m);
}
}
