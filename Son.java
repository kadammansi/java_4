interface Father
{
public void BringWater();
} 
interface Mother
{
public void BringWater();
}
public class Son implements Father , Mother
{
public void BringWater()
{
System.out.println("Brought the water for Father and Mother");
}
public static void main(String args[])
{
Son s = new Son();
s.BringWater();
}
}