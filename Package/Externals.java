 package SEE;
           import java.util.Scanner;
           public class Externals extends CIE.Student
           { public int see[]=new int[5];
            Scanner get=new Scanner(System.in);
public void getm()
  { for(int i=0;i<5;i++)
  { System.out.println("Subject "+(1+i));
   see[i]=get.nextInt(); }
    }
     public void dispsm()
      {for(int i=0;i<5;i++)
      { System.out.printf("%d\t",see[i]); }
       }
       }