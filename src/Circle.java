package app;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.*;

import javax.swing.JComponent;

public class Circle extends JComponent{


    Image img;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        g.setColor(Color.PINK);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        g.drawOval(5, 5, 22, 22);
        /*
        g.setColor(Color.YELLOW);
        g2.setStroke(new BasicStroke(2));
        g.drawOval(0, 0, 2, 2);
        */
    }
}
