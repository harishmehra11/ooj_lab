import java.awt.*;
import java.awt.event.*;
class SampleDialog extends Dialog implements ActionListener
{ IntDivUp idu;
SampleDialog(Frame parent, String title)
{ super(parent, title, false);
idu=(IntDivUp)parent;
setLayout(new FlowLayout());
setSize(500, 200);
add(new Label(idu.errmsg));
Button b;

add(b = new Button("OK"));
b.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{ dispose(); }
}
public class IntDivUp extends Frame implements ActionListener
{ TextField Num1, Num2,Result;
Button Divide;
String errmsg="";
public IntDivUp()
{ setLayout(new FlowLayout());
Divide = new Button("Divide");
Label Num1p = new Label("Num1: ", Label.RIGHT);
Label Num2p = new Label("Num2: ", Label.RIGHT);
Num1 = new TextField(10);
Num2 = new TextField(10);
Result = new TextField(10);
add(Num1p);
add(Num1);
add(Num2p);
add(Num2);
add(Divide);
add(Result);
Divide.addActionListener(this);
addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent we)
{ System.exit(0); }
});
}
public void actionPerformed(ActionEvent ae)
{
int a=0,b=1,r=0;
try
{a = Integer.parseInt(Num1.getText());
b = Integer.parseInt(Num2.getText());}
catch(NumberFormatException e)
{ errmsg= "Caught: "+e;
SampleDialog d = new SampleDialog(this, "Dialog");
d.setVisible(true); }
try
{ r=a/b; }
catch(ArithmeticException e)
{ errmsg= "Caught: "+e+" Num2= "+ b;
SampleDialog d = new SampleDialog(this, "Dialog");
d.setVisible(true); }
Result.setText(" "+r);
}
public static void main(String args[])
{ IntDivUp appwin = new IntDivUp();
appwin.setSize(new Dimension(700,700));
appwin.setTitle("Integer Division");
appwin.setVisible(true);
}
}
