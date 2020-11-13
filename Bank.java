package test;
import java.util.Scanner;


public class Account
{
	
		String name,temp;
		int acc_num;
		char acc;
		double deposit;
		double balance=0;
		Scanner sc= new Scanner (System.in);
		
		void input_data()
		{
			System.out.println("Enter the type of account?");
			temp=sc.nextLine();
			acc=temp.charAt(0);
		}
		void deposit()
		{
			System.out.println("Enter the amount to be deposit:");
			deposit=sc.nextDouble();
			balance +=deposit;
			System.out.println("Amount"+deposit+ "has been created");
		}
		void display_balance()
		{
			System.out.println("Balance:"+balance);
		}
		public static void main(String args[]) {
			int x;
			Scanner s= new Scanner(System.in);
			Account a1=new Account();
			a1.input_data();
			if(a1.acc=='c'||a1.acc=='C')
			{
				current c1=new current();
				do {
					System.out.println("***********Current Account**********");
					System.out.println("1.Deposit.");
					System.out.println("2.Check Balance.");
					System.out.println("3.Issue cheque.");
					System.out.println("4.Exit.");
					System.out.println("Enter the choice:");
					x=s.nextInt();
					switch(x)
					{
					case 1:c1.deposit();
					break;
					case 2:c1.display_balance();
					break;
					case 3:c1.cheque();
					break;
					case 4:System.exit(0);
					break;
					default:System.out.println("ENter choice is not valid.");
					}
				}while(x<=4&&x>=1);
			}
			else if(a1.acc=='S'||a1.acc=='s')
			{
				savings s1= new savings();
				do {
					System.out.println("***********savings Account**********");
					System.out.println("1.Deposit.");
					System.out.println("2.Check Balance.");
					System.out.println("3.Withdraw.");
					System.out.println("4.Calculate compound interest.");
					System.out.println("5.Exit.");
					System.out.println("Enter the choice:");
					x=s.nextInt();
					switch(x)
					{
					case 1:s1.deposit();
					break;
					case 2:s1.display_balance();
					break;
					case 3:s1.withdraw();
					break;
					case 4:s1.compute_cmp();
					case 5:System.exit(0);
					break;
					default:System.out.println("ENter choice is not valid.");
					}
				}while(x<=5&&x>=1);
				}
				else
					System.out.println("Invalid account type.");
				
			}
			
			}
			
			
		
		
		

	  class savings extends Account
	 {
		 double comp,withdraw,time;
		 savings()
		 {System.out.println("ENter the name:");
		 name=sc.nextLine();
		 System.out.println("Enter the account number:");
		 acc_num=sc.nextInt();
		 deposit();
		 }
		 
		 void compute_cmp()
		 {
			 System.out.println("Enter the time period:");
			 time=sc.nextDouble();
			comp=balance*Math.pow(1+(0.08/12),12*time)-balance;
			System.out.println("Compound Interest:"+comp);
			balance+=comp;
			System.out.println("The compound interest has been added to the balance.");
		 }
		 void withdraw()
		 {
			 System.out.println("Enter the amount to withdraw:");
			 withdraw=sc.nextDouble();
			 if(withdraw>balance) {System.out.println("Not sufficient balance.");}
			 else
			 {balance=balance-withdraw;
			 System.out.println("Amount "+withdraw+" has been withdrawn.");
			 }
		 }
	 }
	  class current extends Account
	 {
		 current()
		 {
		System.out.println("Enter your name:");
		name=sc.nextLine();
		System.out.println("ENter the account number:");
		acc_num=sc.nextInt();
		deposit();
		 }
		 double chq_amt;
		 void cheque()
		 {
			 System.out.println("ENter the amount for the cheque:");
			 chq_amt=sc.nextDouble();
			 if(chq_amt>balance)
			 {System.out.println("Sorry,Not enough balance!");}
			 else {balance=balance-chq_amt;
			 System.out.println("Cheque has been issued.");}
		 }
		 void check_balance()
		 {
			 if(balance<1000)
			 {System.out.println("Current balance is less than min. required balance.");
			 balance=balance-100;}
			 display_balance();
		 }
	 }



	

