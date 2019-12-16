import java.awt.Rectangle;
import java.util.List;
import java.awt.*;

import javax.swing.JComponent;

class Monster extends JComponent{
    private int health;
    private Direction facing;
    protected int speed_delay;
    List<Integer> coordination;


    public Monster(int health,  int speed_delay) {
        this.health = health;
        this.speed_delay = speed_delay;
    }
}
