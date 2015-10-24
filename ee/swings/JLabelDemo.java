import java.awt.*;
import javax.swing.*;
/*<applet code="JLabelDemo" width=500 height=400> </applet> */
public class JLabelDemo extends JApplet
{
  public void init()
  {
    try
    {
      SwingUtilities.invokeAndWait(
        new Runnable() {
          public void run() {
                 makeGUI();
          }
        } );
    } catch (Exception e) {}
  }


 private void makeGUI() 
  {
    ImageIcon ii = new ImageIcon("welcome.gif");
    JLabel jl = new JLabel("WELCOME",ii,JLabel.CENTER);
    add(jl);
  }
}
