
import java.awt.*;

import javax.print.DocFlavor.STRING;

import java.applet.*;


// <applet code="Havalad" width=100 height=100> </applet>

public class Havalad extends Applet
{
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 String msg;
	
	public void init()
	{
	  System.out.println("Initialisation\n");
	  setBackground(Color.black);
	  setForeground(Color.RED);
	  msg="VTU Belguam";
	}
	
	public void start()
	{
		System.out.println("Started\n");
	}
	
	
	
	public void paint(Graphics g) {
		
   g.drawString(msg, 50, 50);		
		
		
		
		
	}

}
