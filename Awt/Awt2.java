import java.awt.*;
class Awt2 extends Frame
{
	Button b1,b2;
	Label l1,l2;
	TextField t1,t2;

	Awt2()
	{
	GridLayout g = new GridLayout(3,2);
	setLayout(g);
	b1= new Button("OK");
	b2= new Button("CANCEL");
	l1=new Label("NUM");
	l2=new Label("NUM");
	t1=new TextField();
	t2=new TextField();

	add(b1);
	add(b2);
	add(l1);
	add(l2);
	add(t1);
	add(t2);
	}
	public static void main(String []args)
	{
	Awt2 x = new Awt2();
	x.setSize(1000,800);
	x.setVisible(true);
	}
}
