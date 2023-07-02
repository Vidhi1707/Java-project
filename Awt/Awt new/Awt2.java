import java.awt.*;
class Awt2 extends Frame
{
	Button b1,b2;
	Awt2()
	{
		
	GridLayout g=new GridLayout(1,2);
	setLayout(g);
	b1=new Button("ok");
	b2=new Button("Cancel");

	add(b1);
	add(b2);
	}
	public static void main(String args[])
    {
    Awt2 A=new Awt2();
    A.setSize(200,300);
    A.setVisible(true);
    }
}
