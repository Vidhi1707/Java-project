import java.util.Scanner;
import java.util.Arrays;
class Arraydescending{
public static void main(String [] args)
{
int [] a= new int[5];
Scanner Sc = new Scanner(System.in);
int i;
for(i=a.length-1; i>=0; i--)
{
a[i] = Sc.nextInt();
}
Arrays.sort(a);
for(i=a.length-1; i>=0; i--)
{
System.out.println(a[i]);
}
}
}
