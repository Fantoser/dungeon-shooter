
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class Roome extends JComponent {

    private int column = 5;
    private int row = 5;

    public Roome(int width, int height) {
        this.column = width;
        this.row = height;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        g.setColor(Color.DARK_GRAY);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(2));
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                g.drawRect(j*32, i*32, 30, 30);
                /*
                g.setColor(Color.RED);
                g2.setStroke(new BasicStroke(2));
                g.drawOval(j*32, i*32, 2, 2);
                */
            }
        }
    }


    public int getColumn() {
        return this.column;
    }

    public int getRow() {
        return this.row;
    }

}