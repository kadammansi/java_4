//overriding
 class Overriding
{
public int add(int a , int b)
{
return a+b;
}
}
public class Addition90 extends Overriding 
{
public int add(int a , int b)
{
return a+b;
}
public static void main(String args[])
{
Addition90  s=new Addition90();

System.out.println("Addition is :" +s.add(2,3));
}
}