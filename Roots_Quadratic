package labPrograms;
import java.util.Scanner;
public class roots {

	public static void main(String[] args) {
		double a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a=sc.nextDouble();
		System.out.println("Enter the value of b:");
		b=sc.nextDouble();
		System.out.println("Enter the value of c:");
		c=sc.nextDouble();
		d=((b*b)-(4*a*c));
		if(d>0)
		{distinct(a,b,d);}
		else if(d==0)
		{equal(a,b,d);}
		else {System.out.println("NO REAL ROOTS!");}
	}
	public static void distinct(double a, double b,double d)
	{
		double x=Math.sqrt(d);
		double r1=(-1*b+x)/(2*a);
		double r2=(-1*b-x)/(2*a);
		System.out.println("The two roots are  "+r1+"and  "+r2);
		}
	public static void equal(double a,double b,double d)
	{
		double x=Math.sqrt(d);
		double r1=(-1*b+x)/(2*a);
		System.out.println("The two roots are  "+r1+"and  "+r1);
	}

}
