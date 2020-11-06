package labPrograms;
import java.util.Scanner;

public class Book
{
	String name,author;
	int price,num_pages;
	
	void Book()
	{
		name="null";
		author="null";
		price=0;
		num_pages=0;
	}
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the book:");
		 name=sc.next();
		System.out.println("Enter the author's name:");
		author=sc.next();
		System.out.println("Enter the number of pages:");
		num_pages=sc.nextInt();
		System.out.println("Enter the price:");
		price=sc.nextInt();
		
	}
	void output()
	{
		System.out.println("\n Name: "+name+"\n Author:  "+author+"\n Number of pages:  "+num_pages+"\n Price:  "+price);
		
	}
	public String toString() {
		return("\n Name: "+name+"\n Author:  "+author+"\n Number of pages:  "+num_pages+"\n Price:  "+price);
	}

	
       
	
		public static void main(String args[])
	 {
		Scanner sc=new Scanner(System.in);
		int n,ch;
		System.out.println("Enter the number of books:");
		n=sc.nextInt();
		Book b[]=new Book[n];
		for(int i=0;i<n;i++)
		{
			b[i]=new Book();
			b[i].input();
		}
		System.out.println("******************************");
		System.out.println("1.Function Method\n2.String method");
		System.out.println("*****************\nEnter choice:");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:for(int i=0;i<n;i++)
		      {b[i].output();}
		        break;
		case 2:for(int i=0;i<n;i++)
		       {System.out.println(b[i]);}
		        break;
		default:System.out.println("Invalid choice.");
		
			
		}
		
		

	}

}
