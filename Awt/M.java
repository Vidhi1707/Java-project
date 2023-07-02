import java.awt.*;
class M extends Frame
{
	Label l1;
	Button b1;
	Choice c1;

	M()
	{
	GridLayout g = new GridLayout(2,2);
	setLayout(g);
	l1=new Label("Branch");
	c1=new Choice();
	c1.add("CSE");
	c1.add("IT");
	c1.add("Mechanical");
	b1= new Button("Ok");
	add(l1);
	add(c1);
	add(b1);
	}
	public static void main(String[]args)
	{
	M x = new M();
	x.setSize(1000,300);
	x.setVisible(true);
	}
}