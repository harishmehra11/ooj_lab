package labPrograms;
import java.util.Scanner;

public class Student {
	String USN,name;
	int num,totalcred;
	int creditsarr[];
	int marksarr[];
	double SGPA;
	
	Student()
	{
		SGPA=0.0d;
	}
	void input() 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter your name:");
	  name =sc.nextLine();
	  System.out.println("Enter your USN:");
	  USN=sc.nextLine();
	  System.out.println("Enter the number of course:");
	  num=sc.nextInt();
	  marksarr=new int[num];
	  creditsarr=new int[num];
			  
	  for(int i=0;i<num;i++) 
	  {
		  System.out.println("Enter the credits for course "+(i+1)+":");
		  creditsarr[i]=sc.nextInt();
		  System.out.println("Enter the marks obtained in course  "+(i+1)+":");
		  marksarr[i]=sc.nextInt();
		  System.out.println();
	  }
	  sc.close();
	}
	void compute()
	{
		for(int i=0;i<num;i++)
		{    
			if(marksarr[i]==100) 
			{
			  SGPA=SGPA+(creditsarr[i]*marksarr[i]/10);
			}
			else if(marksarr[i]>=35&&marksarr[i]<100) 
			{
				SGPA=SGPA+(creditsarr[i]*((marksarr[i]/10)+1));
			}
			else 
			{
				SGPA=0;
			}
			totalcred+=creditsarr[i];
		}
		SGPA/=totalcred;
	}
	void display() 
	{
		System.out.println("*************RESULTS***********");
		System.out.println("Student Name:"+name);
		System.out.println("Student USN:"+USN);
		for(int i=0;i<num;i++)
		{
		 System.out.println("SUBJECT "+(i+1)+":"+marksarr[i]);
		}
		System.out.println("SGPA  :"+SGPA);
	}
	
	public static void main(String[] args) 
	{
		
		Student result= new Student();
		result.input();
		result.compute();
		result.display();
		

	}

}
