package CIE;
import java.util.Scanner;
public class Internals extends Student
{ public int cie[]=new int[5];
  Scanner get=new Scanner(System.in);
   public void geti()
    { System.out.println("Enter Details: ");
     System.out.println("USN :");
     usn = get.next();
     System.out.println("NAME :");
     name =get.next();
     System.out.println("SEMESTER :");
     sem =get.nextInt();
     System.out.println("CIE MARKS :");
     for(int i=0;i<5;i++)
     { System.out.println("Subject "+(1+i));
      cie[i]=get.nextInt(); }
       }
        public void dispi()
         { System.out.println("\nUSN :"+usn);
          System.out.println("NAME :"+name);
          System.out.println("SEMESTER :"+sem);
          System.out.println("CIE :");
          for(int i=0;i<5;i++)
          { System.out.printf("%d\t",cie[i]); }
          System.out.println("\nSEE :");
           }
           }