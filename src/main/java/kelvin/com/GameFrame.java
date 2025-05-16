package kelvin.com;

import javax.swing.*;

public class GameFrame  extends JFrame {
    GameFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new snakeProject());
        this.setResizable(false);
        this.setTitle("Game");
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);


    }


}
