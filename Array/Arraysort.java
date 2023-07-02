import java.util.Scanner;
import java.util.Arrays;
class Arraysort{
public static void main(String [] args)
{
int [] a= new int[5];
Scanner Sc = new Scanner(System.in);
int i;
for(i=0; i<a.length; i++)
{
a[i] = Sc.nextInt();
}
Arrays.sort(a);
for(i=0; i<a.length; i++)
{
System.out.println(a[i]);
}
}
}
