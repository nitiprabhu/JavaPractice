import java.awt.*;
import java.applet.*;
//<applet code=Human.class width=400 height=200></applet>
public class Human extends Applet
{
public void paint(Graphics g)
{
g.drawOval(40,40,120,150);
g.drawOval(57,75,30,20);
g.drawOval(110,75,30,20);
g.drawOval(68,81,10,10);
g.drawOval(121,81,10,10);
g.drawOval(85,100,30,30);
g.fillArc(60,125,80,40,180,180);
g.drawOval(25,92,15,30);
g.drawOval(25,92,15,30);
g.drawLine(100,190,100,400);
g.drawLine(100,210,70,250);
g.drawLine(100,210,130,250);
g.drawLine(100,400,56,450);
g.drawLine(100,400,150,450);
}
}
