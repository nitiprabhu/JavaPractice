/* Using an applet context, getCodeBase(),
and showDocument() to display an HTML file.
*/
import java.awt.*;
import java.applet.*;
import java.net.*;

public class ACDemo extends Applet{
public void start() {
AppletContext ac = getAppletContext();
URL url = getCodeBase(); // get url of this applet
System.out.println(url);
try {
ac.showDocument(new URL(url+"appl.html"));
} catch(MalformedURLException e) {
showStatus("URL not found");
}
}
}