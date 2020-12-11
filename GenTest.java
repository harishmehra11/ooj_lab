class Gen<A,B,C>
{
A iob;
B strob;
C dob;
Gen(A io,B so,C doj)
{
iob=io;
strob=so;
dob=doj;
}
A getiob()
{return iob;}
B getstrob()
{return strob;}
C getdob()
{return dob; }
void showType()
{
System.out.println("Types:\n 1."+iob.getClass().getName());
System.out.println("2."+strob.getClass().getName());
System.out.println("3."+dob.getClass().getName());
}
}

class GenTest
{
public static void main(String args[])
{
Gen<Integer,String,Double> obj=new Gen<Integer,String,Double>(14,"Lingardinho",9.58001);
obj.showType();
int i=obj.getiob();
String str=obj.getstrob();
double d=obj.getdob();
System.out.println("Values:");
System.out.println("1. "+i);
System.out.println("2. "+str);
System.out.println("3. "+d);
}
}