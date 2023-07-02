import java.awt.*;
class Awt11 extends Frame
{
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2,b3;
	Choice c;
	Checkbox r1,r2;
	CheckboxGroup chg;

	Awt11()
	{
	l1=new Label("NAME");
	l2=new Label("MOBILE NO");
	t1=new TextField();
	t2=new TextField();

	b1= new Button("SAVE");
	b2=new Button("Discard");
	b3=new Button("Gender");

	c= new Choice();
	c.add("BRANCH");
	c.add("CSE");
	c.add("IT");
	c.add("MECHANICAL");
	c.add("CIVIL");

	chg=new CheckboxGroup();
	r1=new Checkbox("MALE",chg,true);
	r2=new Checkbox("FEMALE",chg,false);
	
	//c.add
	add(l1);
	add(t1);
	add(l2);
	add(t2);
	add(c);
	add(b3);
	add(r1);
	add(r2);
	add(b1);
	add(b2);

	setLayout(null);
	l1.setBounds(100,70,80,30);
	t1.setBounds(200,70,80,30);
	l2.setBounds(100,150,80,30);
	t2.setBounds(200,150,80,30);
	c.setBounds(100,230,80,30);
	b3.setBounds(100,310,80,30);
	r1.setBounds(100,340,80,20);
	r2.setBounds(100,360,80,20);
    b1.setBounds(100,430,80,30);
    b2.setBounds(200,430,80,30);
	}
	public static void main(String args[])
	{
     Awt11 A=new Awt11();
     A.setSize(500,600);
     A.setVisible(true);
	}

}