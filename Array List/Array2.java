import java.util.ArrayList;
class Array2
{
	public static void main(String []args)
	{
		int s=0,i;
		Scanner Sc = new Scanner(System.in);
	ArrayList<Integer> l=new ArrayList<Integer>();

	for(i=1;i<=5;i++)
	{
		l.add(Sc.nextInt());
	}
	for(int v:l)
	{
		s=l+v;
	}
	{
	System.out.println(s);
	}
	}
}