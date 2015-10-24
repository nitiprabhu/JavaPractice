// An Applet skeleton.
import java.awt.*;
import java.applet.*;

/*<applet code = "AppletSkel" width=200 height=100> </applet > */

public class AppletSkel extends Applet {
// Called first.
public void init() {
// initialization
System.out.println("---init executed---");
}
/* Called second, after init(). Also called whenever
the applet is restarted. */
public void start() {
// start or resume execution
  System.out.println("---start executed---");

  }
// Called when the applet is stopped.
public void stop() {
// suspends execution
System.out.println("---stop executed---");

  }
/* Called when applet is terminated. This is the last
method executed. */
public void destroy() {
// perform shutdown activities
System.out.println("---destroy executed---");

  }
// Called when an applet's window must be restored.
public void paint(Graphics g) {
// redisplay contents of window
System.out.println("---paint executed---");

  }
}