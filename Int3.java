import java.util.Scanner;
class Int3
{
public static void main(String []args)
{
int a,b,i;
Scanner Sc = new Scanner(System.in);
a=Sc.nextInt();
b=Sc.nextInt();
for(i=a; i<=b;i=i+1)
{
if(i%2==0)
{
System.out.println(i);
}
}
}
}