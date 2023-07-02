import java.util.Scanner;
class Wtrue2{
public static void main(String [] args)
{
int a, s=0;
Scanner Sc = new Scanner(System.in);
while(true)
{
a=Sc.nextInt();
if(a==-1)
{
break;
}
s=s+a;
}
System.out.println(s);
}
}




