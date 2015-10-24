/* A simple applet that sets the foreground and
background colors and outputs a string. */
import java.awt.*;
import java.applet.*;


/* <applet code="Sample" width=800 height=500>
</applet> */

public class Sample extends Applet{
String msg;

// set the foreground and background colors.
public void init() {
setBackground(Color.cyan);
setForeground(Color.red);
msg = "Inside init() --";
}
// Initialize the string to be displayed.
public void start() {
msg += " Inside start() --";
}

public void stop() {
msg += " Inside stop( ) --";
}

// Display msg in applet window.
public void paint(Graphics g) {
msg += " Inside paint( ).-- ";
g.drawString(msg,20,30);
}
}