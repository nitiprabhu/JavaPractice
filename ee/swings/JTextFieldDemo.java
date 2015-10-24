import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

/*<applet code="JTextFieldDemo" width=500 height=400> </applet> */

public class JTextFieldDemo extends JApplet
{
    JTextField jtf;
    public void init() 
    {
        try
        {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run()
                {
                    makeGUI();
               }
            });
        }catch(Exception e){}
     }


 private void makeGUI()
     {
         setLayout(new FlowLayout());
         jtf=new JTextField(20);
         add(jtf);
         jtf.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
                showStatus(jtf.getText());
            }
        });
      }
    }
