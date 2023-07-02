import java.util.Scanner;
class Dt1
{
protected int a,b, s=0;

public void set(int a,int b)
{
this.a=a;
this.b=b;
}
}
class Dt2 extends Dt1
{
public void grade()
	{
	if (a>b)
	System.out.println("A is Greater");
	else
	System.out.println("B is Greater");
	}
}
class Dt3 extends Dt2
{
public void add()
	{
	System.out.println(a+b);
	}

public static void main(String [] args)
{
Dt3 d = new Dt3();
d.set(4,5);
d.grade();
d.add();
}
}
