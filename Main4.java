import java.util.Scanner;
class Employee
{
	public float salary;
	
}
class Manager extends Employee
{
     public static int manager_total_salary=0;
	public void calculateSalary(int salary)
	{
	    manager_total_salary=manager_total_salary+salary;
	}
}
class Programmer extends Employee
{
      public static int programmer_total_salary=0;
	public void calculateSalary(int salary)
	{
	    programmer_total_salary=programmer_total_salary+salary;
	}
}
class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Programmer [] programmer=new Programmer[100];
		Manager [] manager=new Manager[50];
		for(int i=0;i<3;i++)
		{
		    programmer[i]=new Programmer();
		    int salary;
		    System.out.print("Enter Programmer salary: ");
		    salary=in.nextInt();
		    programmer[i].calculateSalary(salary);
		    //programmer[i].calculateSalary((float)salary);
		    
		}
		System.out.println("Enter manager salarys: ");
		for(int i=0;i<3;i++)
		{
		    manager[i]=new Manager();
		    int salary;
		    System.out.print("Enter Manager salary: ");
		    salary=in.nextInt();
		    manager[i].calculateSalary(salary);
		    //manager[i].calculateSalary((float)salary);
		    
		}
		Programmer p=new Programmer();
		System.out.println("the total salary"+(p.programmer_total_salary));
		Manager m=new Manager();
		System.out.print("the total salary"+(m.manager_total_salary));
		
	}
}