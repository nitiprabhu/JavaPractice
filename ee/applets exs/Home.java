import java.awt.*;
import java.applet.*;
//<applet code=Home.class width=400 height=200></applet>
public class Home extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.pink);

g.drawRect(40,40,80,80);
g.drawLine(80,10,40,40);
g.drawLine(80,10,120,40);
g.drawRect(70,80,20,40);
}
}