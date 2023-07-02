import java.lang.*;
interface I1
{
	abstract public void show();
}
class M implements I1
{
	public void show()
	{
	System.out.println("A");
	}
	public static void main(String [] args)
	{
	M m = new M();
	m.show();
	}
}
