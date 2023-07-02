import java.awt.*;
class Awt3 extends Frame
{
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2;
	Awt3()
	{
	GridLayout g = new GridLayout(3,2);
	setLayout(g);
	l1=new Label("NUM");
	l2=new Label("SUM");
	t1=new TextField();
	t2=new TextField();
	b1=new Button("OK");
	b2=new Button("CANCEL");
	add(l1);
	add(t1);
	add(l2);
	add(t2);
	add(b1);
	add(b2);
	}
	public static void main(String[]args)
	{
	Awt3 a= new Awt3();
	a.setSize(500,400);
	a.setVisible(true);
	}
}