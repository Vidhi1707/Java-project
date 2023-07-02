import java.util.Scanner;
class Array{
public static void main(String [] args)
{
int [ ] a = new int[5];
Scanner Sc = new Scanner(System.in);
int i,s=0;
System.out.println("Enter 5 no =  " );
for(i=0;i<a.length;i++)
{
a[i] = Sc.nextInt();
}
for(i=0; i<a.length;i++)
{
	s=s+a[i];
}
System.out.println(s);
}
}