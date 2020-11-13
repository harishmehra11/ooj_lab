



import java.util.Scanner;
abstract class Employee
{
    
	Scanner sc=new Scanner(System.in);
	 Employee(String name, String title)
	{ 
		this.name = name;
		this.title = title;
	}

	
	 String Name()
	{ 
		return name;
	}
	  
	
	 String title()
	{
		return title;
	}
	  
	
	public String toString()
	{
		return name + " title: " + title;
	}
			
	
	public abstract double weeklyPay();

	
	
	private String name, title;
}


class HourlyEmployee extends Employee
{
	
	HourlyEmployee(String name, String title, int Rate)
	{ 
		super(name, title);
		this.Rate = Rate;
	}
	   
	
	
	
	public double weeklyPay()
	{
		
			return Rate * hours;
	}

	
	private int Rate,hours;
}


class SalariedEmployee extends Employee
{
	
	 SalariedEmployee(String name, String title, double Salary)
	{ 
		super(name, title);
		this.Salary = Salary;
	}
	   
	
	
		
	
	public double weeklyPay()
	{
		return Salary ;
	}

	
	
	private double Salary;
}


 public class Test
{
	public static void main(String [] args)
	{
			
			Employee E;
		
		String ch;
		char c;
		System.out.println("Enter the type of Employee?H/S");
		Scanner sc=new Scanner(System.in);
		ch=sc.next();
		c=ch.charAt(0);	
		if(c=='H'||c=='h')
		{
		    System.out.println("**************Hourly Employee********");
		HourlyEmployee H1= new HourlyEmployee("Ram","Worker",200);
		E=H1;
		E.weeklyPay();
		}
		else if(c=='S'||c=='C')
		{
			System.out.println("*************Salaried Worker**********");
			SalariedEmployee S1=new SalariedEmployee("Suresh" ,"manager",200.00);
			E=S1;
			E.weeklyPay();
		}
		else 
		{
			System.out.println("Invalid Choice.");
		}
	
				
		
	}
}
