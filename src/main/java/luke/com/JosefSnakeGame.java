package josefDeEmpire.example;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class JosefSnakeGame {
    public static void main(String[] args) {}

    static final  int screen_width = 600;
    static final  int screen_height = 600;
    static final  int unit_size = 25;
    static final  int game_unit = (screen_width*screen_height)/(unit_size*unit_size*unit_size);
    static final  int delay = 500;
    final int x[] = new int[game_unit];
    final int y[] = new int[game_unit];
    int bodyParts = 6;
    int appleEaten =0;
    int appleX;
    int appleY;
    public static char direction = 'R';
    boolean running  = false;
    Timer  timer;
    Random random;


    public void snakeGameFrame(){
            JFrame frame = new JFrame("Snake Game");
            frame.add(new SnakeGame());
            frame.setTitle("Snake");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.pack();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
    }

    public void gameStartPoint(){
        JPanel panel = new JPanel();
        random = new Random();
        panel.setPreferredSize(new Dimension(screen_width,screen_height));
        panel.setBackground(Color.BLACK);
        panel.setFocusable(true);
        panel.addKeyListener(new SnakeGame.MyKeyAdapter());
//        startGame();
    }
}
