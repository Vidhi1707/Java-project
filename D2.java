import java.util.Scanner;
class Empy{
private int id;
private String name;
private float salary;
private String dept;
private long mob;

public void set(int i,String n ,float s, String d, long m)
	{
	id= i;
	name = n;
	salary = s;
	dept = d;
	mob = m;
	}
public int getid()
	{
	return id;
	}
public String getname()
	{
	return name;
	}
public float getsalary()
	{
	return salary;
	}
public String getdept()
	{
	return dept;
	}
public long getmob()
	{
	return mob;
	}
}
class D12
{
public static void main(String[] args)
{
Empy n= new Empy();
n.set(101,"Ashi",4000,"CSE", 987659857);
System.out.println("Id no= "+n.getid());
System.out.println("Name = "+n.getname());
System.out.println("Salary= "+n.getsalary());
System.out.println("Dept = "+n.getdept());
System.out.println("Mob= "+n.getmob());
}
}
