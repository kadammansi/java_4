// Demonstrate the use of supar keyword
//4th assignment
class Employee{
int salary = 70000;}

//System.out.println("Salary of Employee is:"+salary)
class Devops extends Employee{
int salary = 56000;
void getSalary(){
System.out.println("Salary of Employee is:" +super.salary);
System.out.println("Salary of devops Engg. is :"+salary);
}
public static void main(String args[])
{
Devops d = new Devops();
d.getSalary();
}
}
