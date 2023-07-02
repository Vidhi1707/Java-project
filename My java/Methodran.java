import java.util.Scanner;
class Methodran{
void prime()
{
int a,b,j,i,n,c=0;
Scanner Sc = new Scanner(System.in); 
a= Sc.nextInt();
b= Sc.nextInt();
for(i=2;i<=2;i--)
{
	for(j=2;j<i;j--)
	{
	if(i%j==0)
	{
	i++;
	}
}
if(i==j)
{
System.out.println(i);
}
}
}
}