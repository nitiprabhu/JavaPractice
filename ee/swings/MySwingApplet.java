import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* This HTML can be used to launch the applet:
<object code="MySwingApplet" width=220 height=90> </object> */

public class MySwingApplet extends JApplet
{
  JButton jbtnAlpha;
  JButton jbtnBeta;
  JLabel jlab;
 
public void init() // Initialize the applet.
  {
    try
    {
      SwingUtilities.invokeAndWait(new Runnable ()
      {
        public void run()
        {
          makeGUI(); // initialize the GUI
        }
      });
    } catch(Exception exc)
    {
      System.out.println("Can't create because of "+ exc);
    }
  }

 private void makeGUI()
  {
   setLayout(new FlowLayout()); 
    // Make two buttons.
    jbtnAlpha = new JButton("Alpha");
    jbtnBeta = new JButton("Beta");

    jbtnAlpha.addActionListener(new ActionListener() // Add action listener for Alpha.
    {
      public void actionPerformed(ActionEvent le)
      {
        jlab.setText("Alpha was pressed.");
      }
    });


jbtnBeta.addActionListener(new ActionListener() // Add action listener for Beta.
    {
      public void actionPerformed(ActionEvent le) {
        jlab.setText("Beta was pressed.");
      }
    });

    // Add the buttons to the content pane.
    add(jbtnAlpha);
    add(jbtnBeta);

   jlab = new JLabel("Press a button.");  // Create a text-based label.

   add(jlab); // Add the label to the content pane.
  }
}


