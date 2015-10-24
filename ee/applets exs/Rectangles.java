/*Draw rectangles

void drawRoundRect(int top, int left, int width, int height,
int xDiam, int yDiam)
void fillRoundRect(int top, int left, int width, int height,
int xDiam, int yDiam)

*/

import java.awt.*;
import java.applet.*;
/*
<applet code="Rectangles" width=300 height=200>
</applet>
*/
public class Rectangles extends Applet {
public void paint(Graphics g) {
g.fillRect(10, 10, 60, 50);
g.drawRect(100, 10, 50,50);
g.drawRoundRect(190, 10, 60, 50, 15, 15);
g.fillRoundRect(70, 90, 140, 100, 30, 40);
}
}