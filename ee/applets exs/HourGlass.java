//void drawPolygon(int x[ ], int y[ ], int numPoints)
//void fillPolygon(int x[ ], int y[ ], int numPoints)

// Draw Polygon
import java.awt.*;
import java.applet.*;
/*
<applet code="HourGlass" width=230 height=210>
</applet>
*/
public class HourGlass extends Applet {
public void paint(Graphics g) {
int xpoints[] = {30, 100, 125, 100, 30,10,30};
int ypoints[] = {30, 30, 70, 100, 100,70,30};
int num = 7;
g.drawPolygon(xpoints, ypoints, num);
}
}