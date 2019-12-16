
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Circle extends Monster {


    private int speed_counter = 0;

    public Circle(int health, int speed_delay) {
        super(health, speed_delay);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.PINK);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        g.drawOval(5, 5, 22, 22);
    }
    
    public void move(Direction direction) {
        speed_counter++;
        if (speed_counter == speed_delay) {
            speed_counter = 0;
            Rectangle bound = this.getBounds();
            if (direction == Direction.UP) {
                    this.setBounds(bound.x, 
                            bound.y - 32, 
                            bound.width, 
                            bound.height);
            }

            if (direction == Direction.DOWN) {
                this.setBounds(bound.x, 
                        bound.y + 32, 
                        bound.width, 
                        bound.height);
            }

            if (direction == Direction.LEFT) {
                this.setBounds(bound.x - 32, 
                        bound.y, 
                        bound.width, 
                        bound.height);
            }

            if (direction == Direction.RIGHT) {
                this.setBounds(bound.x + 32, 
                        bound.y, 
                        bound.width, 
                        bound.height);
            }
        }
    }
}
