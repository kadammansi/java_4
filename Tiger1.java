//demonstrate the use of abstract class 
abstract class Animal{
public abstract void voice();
}
public class Tiger1 extends Animal{
public void voice()
{
System.out.println("In Tiger");
}
public static void main(String args[])
{
Tiger1 t = new Tiger1();
t.voice();
}
}
