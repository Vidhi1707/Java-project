import java.util.Scanner;
class Infact
{
public static void main(String [] args)
{
int i,n,f=1;
 Scanner Sc = new Scanner(System.in);
n= Sc.nextInt();
for(i=n; i>=1;i-- )
	{
	f=f*i;
	}
for(i=1; i<=f/2;i++)
{
	if(f%i == 0)
	{
	System.out.println(i);
	}	

}
}
}