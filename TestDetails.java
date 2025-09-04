abstract class BankAccount{
 abstract void deposit();
 abstract void withdrawl();
abstract void checkBalance();
void getDetails()
{
System.out.println("get the information of customer like Name , Address, Mobile No.");
}
}
class SavingAccount extends BankAccount{
void deposit()
{
System.out.println("Rs. 4000 Deposited");
}
void withdrawl()
{
System.out.println("Rs.1000 Withdrawl");
}
void checkBalance()
{
System.out.println("Balance is 3000");
}
}
class CurrentAccount extends BankAccount{
void deposit()
{
System.out.println("Rs. 5000 Deposited");
}
void withdrawl()
{
System.out.println("Rs.1000 Withdrawl");
}
void checkBalance()
{
System.out.println("Balance is 4000");
}
}
public class TestDetails
{
public static void main(String args[])
{
BankAccount b1 = new SavingAccount();
BankAccount b2 = new CurrentAccount();
b1.getDetails();

b1.deposit();
b1.withdrawl();
b1.checkBalance();
b2.getDetails();
b2.deposit();
b2.withdrawl();
b2.checkBalance();
}
}

