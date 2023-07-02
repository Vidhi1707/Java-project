import java.util.Scanner;
class Table
{
public static void main(String []args)
{
int a,i;
Scanner Sc = new Scanner(System.in);
a=Sc.nextInt();
for(i=1; i<=10; i=i+1)
{
System.out.println(a*i);
}
}
}