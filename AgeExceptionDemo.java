import java.util.Scanner;
class AgeException1 extends Exception
{ private int sa,fa;
AgeException1(int a,int b)
  { sa = a;
   fa = b; }
    public String toString()
     { return "age.Exception.FAther's age can't be less than son's age."; }
     }
     class AgeException2 extends Exception
     { private int sa,fa;
      AgeException2(int a,int b)
       { sa = a;
        fa = b; }
         public String toString()
          { return "age.Exception.Age(<0)"; }
          }
          class Father
          { int Fage; }
          class Son extends Father
          { int Sage;
           String Sname;
Son(int age,int fage) throws AgeException1, AgeException2
  { Sage=age;
  
    Fage=fage;
     System.out.println("Son Name: " + Sname);
      System.out.println("Son age: " + Sage);
       System.out.println("Father age " + Fage);
if(Sage<0||Fage<0)
  throw new AgeException2(age,fage);
   if(age>=fage)
    throw new AgeException1(age,fage);
     }
     }
     class AgeExceptionDemo
     { public static void main(String args[])
      { int sa,fa; String name;
       Scanner get=new Scanner(System.in);
       
          System.out.println("Enter Son age: ");
           sa=get.nextInt();
            System.out.println("Enter Father age ");
             fa=get.nextInt();
              try
               { Son s=new Son(sa,fa); }
                catch (AgeException1 e)
                 { System.out.println("Caught " + e); }
                 catch (AgeException2 e)
                  { System.out.println("Caught " + e); }
                   }
                   }