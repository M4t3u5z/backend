import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;


public class GameFrame extends JFrame {

    GamePanel panel;

    GameFrame(){
        panel  = new GamePanel();
        this.add(panel);
        this.setTitle("PONG GAME");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);


    }

}
