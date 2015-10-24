import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/* <applet code="JButtonDemo" width=250 height=450> </applet> */
public class JButtonDemo extends JApplet
implements ActionListener
{
  JLabel jlab;
  public void init()
  {
    try{
      SwingUtilities.invokeAndWait( new Runnable() {
          public void run()
          {
            makeGUI();
          }
        }
      );
    } catch (Exception exc) { }
  }

 private void makeGUI()
  {
    setLayout(new FlowLayout());
    ImageIcon france = new ImageIcon("france.gif");
    JButton jb = new JButton(france);
    jb.setActionCommand("France");
    jb.addActionListener(this);
    add(jb);

    ImageIcon germany = new ImageIcon("germany.gif");
    jb = new JButton(germany);
    jb.setActionCommand("Germany");
    jb.addActionListener(this);
    add(jb);

   ImageIcon italy = new ImageIcon("italy.gif");
    jb = new JButton(italy);
    jb.setActionCommand("Italy");
    jb.addActionListener(this);
    add(jb);

    ImageIcon japan = new ImageIcon("japan.gif");
    jb = new JButton(japan);
    jb.setActionCommand("Japan");
    jb.addActionListener(this);
    add(jb);

    // Create and add the label to content pane.
    jlab = new JLabel("Choose a Flag");
    add(jlab);
  }


 // Handle button events.
  public void actionPerformed(ActionEvent ae)
  {
    jlab.setText("You selected " + ae.getActionCommand());
  }
}
