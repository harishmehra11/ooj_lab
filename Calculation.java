import java.util.Scanner;
import Arith.*;
class Calculation
{ 
public static void main(String args[])
{
	
Scanner sc=new Scanner(System.in);
int a,b,ch;

Add ad=new Add();
Sub sb=new Sub();
mult m=new mult();
div d=new div();
do{
	System.out.println("Enter the value of Operand 1;");
a=sc.nextInt();
System.out.println("Enter the value of Operand 2;");
b=sc.nextInt();
	System.out.println("1.Addition");
	System.out.println("2.Subtraction");
	System.out.println("3.Multiplication");
	System.out.println("4.Division");
	System.out.println("5.Exit");
	System.out.println("Enter your choice:");
	ch=sc.nextInt();
	

switch(ch)
{
	case 1:ad.addcal(a,b);
	break;
	case 2:sb.subcal(a,b);
	break;
	case 3:m.multcal(a,b);
	break;
	case 4:d.divcal(a,b);
	break;
	
	default:System.out.println("Invlaid choice.");
}
}while(ch<5);

}
}