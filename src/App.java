package app;


import javax.swing.*;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class App {
    
    private static int speed = 32;
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Window with one button");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton button = new JButton("Butt");
        button.setBounds(50, 80, 300, 300);

        Circle circle = new Circle();
        circle.setBounds(32, 32, 32, 32);

        Room room = new Room(30, 20);
        //room.setBounds(32, 32, 100, 100);
        room.setBounds(32, 32, room.getColumn()*32, room.getRow()*32);

        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ev) {
                
            }

            @Override
            public void keyPressed(KeyEvent ev) {
                int keyCode = ev.getKeyCode();
                Rectangle origBoudns = circle.getBounds();
                if(keyCode == KeyEvent.VK_RIGHT){
                    if (circle.getX()+32 < room.getX()+room.getWidth()) {
                        circle.setBounds(origBoudns.x + speed, 
                                origBoudns.y, 
                                origBoudns.width, 
                                origBoudns.height);
                    }
                }
                else if(keyCode == KeyEvent.VK_LEFT){
                    if (circle.getX()-32 >= room.getX()) {
                        circle.setBounds(origBoudns.x - speed, 
                                origBoudns.y, 
                                origBoudns.width, 
                                origBoudns.height);
                    }
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
            public void keyReleased(KeyEvent ev) {
                
            }
        });
        frame.add(circle);
        frame.add(room);
        frame.setVisible(true);
           
    }
}
