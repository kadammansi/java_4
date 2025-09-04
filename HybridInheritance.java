interface Father
{
 void bringWater();
}
interface Mother{
 public void bringWater();
}
 class Son1 implements Father , Mother
{
 public void bringWater()
{
System.out.println(" Brought the Water for Father and Mother");
}
}
 class Xyz extends Son1
{
 public void bringWater()
{
System.out.println("Brought Water");
}
}
class Pqr extends Son1{
 public void bringWater()
{
System.out.println("Brought Water");
}
}
 class HybridInheritance{  
public static void main(String args[])
{
Xyz x =new Xyz();
x.bringWater();
Pqr p =new Pqr();
p.bringWater();
Son1 s = new Son1();
s.bringWater();

}
}
