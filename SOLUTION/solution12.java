import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class solution12 extends Applet {
  /*  <applet code="OvalApplet.class" width="500" height="500">
         <param name="numOvals" value="5">
      </applet>*/
   int numOvals;
   
   public void init() {
      String num = getParameter("numOvals");
      numOvals = Integer.parseInt(num);
   }

   public void paint(Graphics g) {
      for(int i = 1; i <= numOvals; i++) {
         int x = (int)(Math.random() * getWidth());
         int y = (int)(Math.random() * getHeight());
         int width = (int)(Math.random() * 100);
         int height = (int)(Math.random() * 100);
         g.drawOval(x, y, width, height);
      }
   }

}
 
