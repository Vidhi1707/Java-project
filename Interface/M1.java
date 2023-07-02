import java.util.Scanner;
class D1
{
	protected int a,b,f=1;
	
}
interface ID1
{
	abstract public void calc();
}
interface IR1
{
abstract public void calc();
}
interface IR2
{
abstract public void calc();
}


class M1 extends D1 implements IR1,IR2
{
public void calc()
{
Scanner Sc = new Scanner(System.in);
a = Sc.nextInt();
for(b=a;b>=1;b=b-1)

	{
	f=f*b;
	}

	System.out.println(f);

}
public static void main(String [] args)
{
M1 x = new M1();
x.calc();
}
}



