import java.awt.*;
class Box extends Frame
{
   	Box()
   	{
	Checkbox c1,c2,c3;
	Button B1;
	GridLayout g = new GridLayout(4,1);
	setLayout(g);
	c1= new Checkbox("C");
	c2= new Checkbox("C++");
	c3= new Checkbox("Java");
	B1= new Button("OK");
	add(c1);
	add(c2);
	add(c3);
	add(B1);
	}
	public static void main(String []args)
	{
	Box a = new Box();
	a.setSize(500,400);
	a.setVisible(true);
	}
}
