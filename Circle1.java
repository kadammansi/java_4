class Shape1{
public void area()
{
System.out.println("In Parent Class");
}
}
class Circle1 extends Shape1{
void Circle1()
{
System.out.println("In Child Class");
}
public static void main(String args[])
{
Circle1 c =new Circle1();
c.area();
}
}