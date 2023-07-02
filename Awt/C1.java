import java.awt.*;
class C1 extends Frame
{
	Checkbox c1,c2;
	CheckboxGroup cbg;
	Button b1;
	
  C1()
	{
	GridLayout g = new GridLayout(3,0);
	setLayout(g);
	cbg = new CheckboxGroup();
	c1=new Checkbox("Male",cbg,true);
	c2=new Checkbox("Female",cbg,false);
	b1=new Button("Ok");
	add(c1);
	add(c2);
	add(b1);
	}
	public static void main(String [] args)
	{
	C1 a = new C1();
	a.setSize(1000,300);
	a.setVisible(true);
	}
}