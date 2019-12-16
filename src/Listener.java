
/*
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Listener implements KeyListener {

    @Override
    public Key keyPressed(KeyEvent e) {
        int keyCode = ev.getKeyCode();
        if(keyCode == KeyEvent.VK_RIGHT){
            return Key.RIGHT;
        }

        else if(keyCode == KeyEvent.VK_LEFT){
            return Key.LEFT;
        }
        else if(keyCode == KeyEvent.VK_UP){
            if (circle.getY()-32 >= room.getY()) {
            circle.setBounds(origBoudns.x, 
                    origBoudns.y - speed, 
                    origBoudns.width, 
                    origBoudns.height);
            }
        }
        else if(keyCode == KeyEvent.VK_DOWN){
            if (circle.getY()+32 < room.getY()+room.getHeight()) {
            circle.setBounds(origBoudns.x, 
                    origBoudns.y + speed, 
                    origBoudns.width, 
                    origBoudns.height);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }
    
}
*/