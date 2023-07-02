import java.awt.*;
class C extends Frame
{
	Checkbox c1,c2,c3;
	Button b1;
	C()
	{
	GridLayout g = new GridLayout(4,0);
	setLayout(g);
	c1=new Checkbox("C");
	c2=new Checkbox("C++");
	c3=new Checkbox("java");
	b1=new Button("OK");
	add(c1);
	add(c2);
	add(c3);
	add(b1);
	}
	public static void main(String [] args)
	{
	C x = new C();
	x.setSize(1000,300);
	x.setVisible(true);
	}
}