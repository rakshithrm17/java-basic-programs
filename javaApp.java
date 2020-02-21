/*<applet code="javaApp" width=600 height=200></applet>*/
import java.awt.*;
import java.applet.*;
public class javaApp extends Applet implements Runnable
{
 int a,b,c,d;
 Thread t;
 
 public void init()
 {
   a=150;
   b=150;
   c=10;
   d=10;
   Thread t= new Thread(this);
   t.start();
 }
 public void paint(Graphics g)
 {
  g.setColor(Color.green);
  for(int i=0;i<15;i++)
  {
   try
   {  t.sleep(200);
   }
   catch(Exception ex)
  { }
  g.drawOval(a,b,c,d);
  a-=10;
  b-=10;
  c+=8;
  d+=8;
  }
 }
public void run()
{}
} 
   