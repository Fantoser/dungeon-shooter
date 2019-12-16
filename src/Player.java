import java.awt.*;

import javax.swing.JComponent;
import java.awt.event.*;

public class Player extends JComponent {

    Color leColor = Color.GREEN;
    public boolean canmove = true;
    public boolean canshoot = true;
    public Direction facing = Direction.RIGHT;

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(leColor);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        g.drawOval(5, 5, 22, 22);
    }

}