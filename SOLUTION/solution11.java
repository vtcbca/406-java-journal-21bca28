import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class solution11 extends Applet {
	/*<applet code="CollegeSquare.class" width="100" height="100"></applet>*/

    public void paint(Graphics g) {
        // draw square
        g.setColor(Color.cyan);
        g.fillRect(50, 50, 200, 200);
        
        // set font
        Font font = new Font("Times New Roman", Font.PLAIN, 12);
        g.setFont(font);
        
        // draw text
        g.setColor(Color.red);
        g.drawString("AGRAWAL PALAK", 70, 130);
    }
}






