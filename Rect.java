/*<applet code="Rect.class" width=200 height=200></applet>*/
import java.awt.*;
import java.applet.*;
public class Rect extends Applet
{
 public void paint(Graphics g)
 {
  g.setColor(Color.red); 
  g.drawLine(700,80,800,700);
  g.setColor(Color.blue);
  g.drawRect(30,60,40,50);
  g.setColor(Color.green);
  g.drawOval(80,180,200,120);
  g.setColor(Color.black);
  g.fillOval(270,30,100,100);
  int x[]={500,420,220,500};
  int y[]={500,220,100,500};
  int n=4;
  g.drawPolygon(x,y,n);
  }
}