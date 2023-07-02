import java.util.Scanner;
import java.util.Arrays;
class Arrayaa{
public static void main(String [] args)
{
int [] a= new int[3];
int [] b=new int[6];
Scanner Sc = new Scanner(System.in);
int i;
for(i=0; i<a.length; i++)
{
a[i] = Sc.nextInt();
}
for(i=0; i<a.length; i++)
{
b[i] = a[i];
b[a.length+i]=a[i];
}
for(i=0;i<b.length;i++)
{
System.out.println(b[i]);
}
}
}

