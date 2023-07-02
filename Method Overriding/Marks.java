import java.util.Scanner;
class Stud
{
	int roll;
	String name;
	String branch;
	Stud()
	{}
	Stud(int r, String n ,String b )
	{roll = r;
	name = n;
	branch = b;
	}
	public int getroll()
	{
	return roll;
	}
public String getname()
	{
	return name;
	}
public String getbranch()
	{
	return branch;
	}
	

}
class Marks extends Stud
{
	float m;
	Marks()
	{}

	Marks(int r, String n, String b, float z)
	{
	super(r,n,b);
	m=z;
	}
	public float getmarks()
	{
		return m;
	}
	public static void main(String [] args)
	{
	Marks m = new Marks(101,"A","CSE",80);
	Marks m2 = new Marks(102,"B","CSE",90);
	System.out.println(m.getmarks());
	System.out.println(m.getroll());
	System.out.println(m.getname());
	System.out.println(m.getbranch());
	System.out.println(m2.getroll());
	System.out.println(m2.getname());
	System.out.println(m2.getbranch());
	System.out.println(m2.getmarks());
	}
}

