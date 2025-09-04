class Animal{
void voice()
{
System.out.println("In Animal Voice:");
}
}
class Tiger extends Animal{
void voice()
{
System.out.println("In Tiger Voice:");
super.voice();
}
public static void main(String args[])
{
Tiger t=new Tiger();
t.voice();
}
}
