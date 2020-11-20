import java.util.Scanner;
       import CIE.*;
       import SEE.*;
       class TotalMarks
       { public static void main(String args[])
        { Scanner get=new Scanner(System.in);
         int n;
         System.out.println("Enetr the no of students: ");
         n=get.nextInt();
          CIE.Internals ints[]=new CIE.Internals[n];
          SEE.Externals exts[]=new SEE.Externals[n];
           for(int i=0;i<n;i++)
           { ints[i]=new CIE.Internals();
            exts[i]=new SEE.Externals();
             ints[i].geti();
              System.out.println("SEE MARKS :");
               exts[i].getm();
               }
               for(int i=0;i<n;i++)
               { ints[i].dispi();
                int total=0;
                 exts[i].dispsm();
                  for(int j=0;j<5;j++)
                   { total=total+ints[i].cie[j]+exts[i].see[j];}
                    System.out.println("\nTOTAL MARKS : "+total);
                    }
                     }
                     }
