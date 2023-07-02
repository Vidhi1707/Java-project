import java.util.ArrayList;
class Array
{
	public static void main(String []args)
	{
	ArrayList<Integer> l=new ArrayList<Integer>();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(1,45);
	l.set(2,72);
	for(int v:l)
	{
	System.out.println(v);
	}
	}
}