abstract class Animal{
public abstract void voice();
public void eat()
{
System.out.println("Eating");
}
}
public class Lion extends Animal{
public void voice()
{
System.out.println("In Lion Voice");
}
public static void main(String args[])
{
Lion l = new Lion();
l.voice();
l.eat();
}
}