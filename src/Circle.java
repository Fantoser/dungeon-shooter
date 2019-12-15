

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.*;

import javax.swing.JComponent;

import org.w3c.dom.Entity;

public class Circle extends JComponent {


    Image img;

    protected void paintComponent(Graphics g) {
        g.setColor(Color.PINK);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        g.drawOval(5, 5, 22, 22);
    }

    public void move() {
        Rectangle bound = this.getBounds();
        this.setBounds(bound.x+1, bound.y, bound.width, bound.height);
    }
}
