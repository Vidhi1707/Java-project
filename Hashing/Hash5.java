import java.util.*;
import java.util.Scanner;
class Hash5{
	public static void main (String[]args)
	{
		
		//Scanner sc = new Scanner(System.in);
		// int v = Sc.next();
		HashMap<String,Integer> h = new HashMap<String,Integer>();
		Scanner sc = new Scanner(System.in);
	h.put("Ashok",40);
	h.put("Amit",50);
	h.put("Siya",60);
	int v = sc.nextInt();
	for(String k:h.keySet())
	{
	if(h.get(k)==v)
	{
	System.out.println(k);
	}
}
}
}