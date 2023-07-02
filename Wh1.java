import java.util.Scanner;
class Wh2{
public static void main(String [] args)
{
int a, p=0, c=0;
Scanner Sc = new Scanner(System.in);
while(true)
{
a=Sc.nextInt();
if(a==-1)
{
break;
}
if(p>a)
{
c=c+1;
}
p=a;
}
if(c==0)
{
System.out.println("YES");
}
else
{
System.out.println("NO");
}
}
}




