import java.util.Scanner;
import java.util.Arrays;
class Array5ba{
public static void main(String [] args)
{
int [] a= new int[5];
int [] b=new int[5];
Scanner Sc = new Scanner(System.in);
int i;
for(i=0; i<5; i++)
{
a[i] = Sc.nextInt();
}
for(i=0; i<5; i++)
{
b[i] = a[4-i];
System.out.println(b[i]);
}
}
}

