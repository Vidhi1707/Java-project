import java.util.Scanner;
class Wht1{
public static void main(String [] args)
{
int a, m=0;
Scanner Sc = new Scanner(System.in);
while(true)
{
a=Sc.nextInt();
if(a==-1)
{
break;
}
if(a>m)
{
m=a;
}
}
System.out.println(m);
}
}




