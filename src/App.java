
import java.awt.Rectangle;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class App extends JPanel {

    private Player player;

    public static void main(String[] args) {
        App app = new App();
    }

    public App() {
        initApp();
    }
    
    public void initApp() {
        JFrame frame = new JFrame("Dungeon shooter");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        //addKeyListener(new TAdapter());
        
        List<Circle> entities = new ArrayList<>();

        JButton button = new JButton("Butt");
        button.setBounds(50, 80, 300, 300);

        Circle circle = new Circle(10, 50);
        circle.setBounds(32, 32, 32, 32);

        Player player = new Player();
        player.setBounds(64, 64, 32, 32);

        SpaceShip ship = new SpaceShip();
        
        Roome room = new Roome(30, 20);
        //room.setBounds(32, 32, 100, 100);
        room.setBounds(32, 32, room.getColumn()*32, room.getRow()*32);
    
        
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ev) {
                
            }

            
            @Override
            public void keyPressed(KeyEvent ev) {
                int keyCode = ev.getKeyCode();
                Rectangle origBoudns = player.getBounds();

                if (player.canmove == true) {

                    if(keyCode == KeyEvent.VK_RIGHT){
                        if (player.getX()+32 < room.getX()+room.getWidth()) {
                            player.setBounds(origBoudns.x + 32, 
                                    origBoudns.y, 
                                    origBoudns.width, 
                                    origBoudns.height);
                                    player.facing = Direction.RIGHT;
                                    player.canmove = false;
                        }
                    }
                    else if(keyCode == KeyEvent.VK_LEFT){
                        if (player.getX()-32 >= room.getX()) {
                            player.setBounds(origBoudns.x - 32, 
                                    origBoudns.y, 
                                    origBoudns.width, 
                                    origBoudns.height);
                                    player.facing = Direction.LEFT;
                                    player.canmove = false;
                        }
                    }
                    else if(keyCode == KeyEvent.VK_UP){
                        if (player.getY()-32 >= room.getY()) {
                            player.setBounds(origBoudns.x, 
                                origBoudns.y - 32, 
                                origBoudns.width, 
                                origBoudns.height);
                                player.facing = Direction.UP;
                                player.canmove = false;
                        }
                    }
                    else if(keyCode == KeyEvent.VK_DOWN){
                        if (player.getY()+32 < room.getY()+room.getHeight()) {
                            player.setBounds(origBoudns.x, 
                                origBoudns.y + 32, 
                                origBoudns.width, 
                                origBoudns.height);
                                player.facing = Direction.DOWN;
                                player.canmove = false;
                        }
                    }
                }

                if (keyCode == KeyEvent.VK_SPACE && player.canshoot == true) {
                    System.out.println("PEW!");
                    player.canshoot = false;
                }
            }
            

            @Override
            public void keyReleased(KeyEvent ev) {
                int keyCode = ev.getKeyCode();
                player.canmove = true;
                if (keyCode == KeyEvent.VK_SPACE) {
                    player.canshoot = true;
                }
            }
        });
        
        frame.add(circle);
        entities.add(circle);
        frame.add(player);
        frame.add(room);


        Timer timer = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                for (Circle circle : entities) {
                    circle.move(Direction.RIGHT);
                }

            }
        });
        timer.start();

        frame.setVisible(true);
           
    }

    /*
    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            player.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            player.keyPressed(e);
        }
    }
    */
}
