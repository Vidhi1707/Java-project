import java.util.*;
class Hash3{
	public static void main (String[]args)
	{
		HashMap<String,Integer> h = new HashMap<String,Integer>();
	h.put("Ashok",40);
	h.put("Amit",50);
	h.put("Siya",60);

	for(String k:h.keySet())
	{
	System.out.println(k+ " "+h.get(k));
	}
}
}