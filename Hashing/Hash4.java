import java.util.*;
import java.util.Scanner;
class Hash4{
	public static void main (String[]args)
	{
		Scanner Sc = new Scanner(System.in);
		String z = Sc.next();
		HashMap<String,Integer> h = new HashMap<String,Integer>();
	h.put("Ashok",40);
	h.put("Amit",50);
	h.put("Siya",60);

	if(h.containsKey(z))
	{
		System.out.println(h.get(z));
	}
	else
	{
	System.out.println("N.A");
	}
}
}