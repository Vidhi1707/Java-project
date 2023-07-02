class Salary
{
public static void main (String[] args)
{
float salary=5000.0f , hra, da ,ta,gp;
hra=salary*0.05f;
da=salary*0.06f;
ta=salary*0.07f;
gp=(salary+hra+da+ta);
System.out.println(hra);
System.out.println(da);
System.out.println(ta);
System.out.println(gp);
}
}