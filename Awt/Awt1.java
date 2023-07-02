import java.awt.*;
class Awt1 extends Frame
{
	Button b1,b2;
	Awt1()
	{
	b1 =new Button("ok");
	b2=new Button("cancel");
	add(b1);
	add(b2);
	GridLayout g = new GridLayout(1,2);
	setLayout(g);
	}
	public static void main(String[]args)
	{
	Awt1 x = new Awt1();
	x.setSize(1000,300);
	x.setVisible(true);

	}
}