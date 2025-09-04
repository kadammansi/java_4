abstract class Player{
public abstract void fitness();
}
public class Bowler extends Player{
public void fitness()
{
System.out.println("BOWLER");
}
public static void main(String args[])
{
Bowler b = new Bowler();
b.fitness();
}
}
