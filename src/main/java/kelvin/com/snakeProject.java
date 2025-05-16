package kelvin.com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class snakeProject extends JPanel implements ActionListener {
    static final int screen_width= 600;
    static final int screen_height= 600;
    static final int unit_size=25;
    static final int game_unit= screen_width*screen_height/unit_size;
    static final int delay=75;
    //arrays to hold the coordinates of the snake's body on the game grid x and y
   final int x[]=new int[game_unit];
   final int y[]=new int[game_unit];

   int bodyparts=6;
   int appleEaten=0;
   //position of the apple on the game screen
    int applex;
    int appley;
    //direction of the snake  when the game starts
    public static char direction='R';
    //the game is not running ,its either at start, pause or game over
    boolean running=false;
    Timer timer;
    Random random;

    snakeProject() {
        random = new Random();
        this.setPreferredSize(new Dimension(screen_width, screen_height));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }

        public void startGame () {
            newApple();
            running = true;
            timer = new Timer(delay, this);
            timer.start();
        }
        public void paintComponent (Graphics g){
            super.paintComponent(g);
            draw(g);

        }
        public void draw (Graphics g){
            if (running) {
                g.setColor(Color.BLACK);
                /*for(int i=0; i<screen_height/unit_size; i++){
                    g.drawLine(i*unit_size,0,i*unit_size,screen_height);
                    g.drawLine(0,i*unit_size,screen_width,i*unit_size);
                }*/
                g.setColor(Color.red);
                g.fillOval(applex, appley, unit_size, unit_size);

                for (int i = 0; i < bodyparts; i++) {
                    if (i == 0) {
                        g.setColor(Color.GREEN);
                        g.fillRect(x[i], y[i], unit_size, unit_size);

                    } else {
                        g.setColor(new Color(45, 36, 0));
                        g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
                        g.fillRect(x[i], y[i], unit_size, unit_size);

                    }
                }
                g.setColor(Color.CYAN);
                g.setFont(new Font("ink Free", Font.BOLD, 40));
                FontMetrics metrics = getFontMetrics(g.getFont());
                g.drawString("Score: " + appleEaten, (screen_width - metrics.stringWidth("Score: " + appleEaten)) / 2, g.getFont().getSize());

            } else {
                gameOver(g);
            }
        }
        //creating a new apple
        public void newApple () {
            applex = random.nextInt(screen_width / unit_size) * unit_size;
            appley = random.nextInt(screen_height / unit_size) * unit_size;

        }
        public void move () {
            for (int i = bodyparts; i > 0; i--) {
                x[i] = x[i - 1];
                y[i] = y[i - 1];

            }
            switch (direction) {
                case 'R':
                    x[0] = x[0] + unit_size;
                    break;
                case 'L':
                    x[0] = x[0] - unit_size;
                    break;
                case 'U':
                    y[0] = y[0] - unit_size;
                    break;
                case 'D':
                    y[0] = y[0] + unit_size;
                    break;
            }
        }
        public void checkApple () {

            if ((x[0] == applex) && (y[0] == appley)) {
                bodyparts++;
                appleEaten++;
                newApple();
            }
        }
        public void checkCollisions () {
            //check if the head touches any bodypart
            for (int i = bodyparts; i > 0; i--) {
                if ((x[0] == x[i]) && (y[0] == y[i])) {
                    running = false;
                }
            }
            //check if head touches the top border
            if (y[0] < 0) {
                running = false;
            }
            //check if the head touches the bottom border
            if (y[0] > screen_height) {
                running = false;
            }
            //check if the head touches the right border
            if (x[0] > screen_width) {
                running = false;
            }
            //check if the head touches the left border
            if (x[0] < 0) {
                running = false;
            }
            if (!running) {
                timer.start();
            }

        }
        public void gameOver (Graphics g){
            //game over text
            g.setColor(Color.red);
            g.setFont(new Font("Ink Free", Font.BOLD, 75));
            FontMetrics metrics = getFontMetrics(g.getFont());
            g.drawString("Game Over!", (screen_width - metrics.stringWidth("Game Over!")) / 2, screen_height / 2);

            g.setFont(new Font("Ink Free", Font.BOLD, 40));
            FontMetrics metrics1 = getFontMetrics(g.getFont());
            g.drawString("Score:" + appleEaten, (screen_width - metrics1.stringWidth("Score: " + appleEaten)) / 2, g.getFont().getSize());

        }
        public static class MyKeyAdapter extends KeyAdapter {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        if (direction != 'D') {
                            direction = 'U';
                        }
                        break;
                    case KeyEvent.VK_DOWN:
                        if (direction != 'U') {
                            direction = 'D';
                        }
                        break;
                    case KeyEvent.VK_LEFT:
                        if (direction != 'R') {
                            direction = 'L';
                        }
                        break;
                    case KeyEvent.VK_RIGHT:
                        if (direction != 'L') {
                            direction = 'R';
                        }
                        break;


                }
            }
        }
        @Override
        public void actionPerformed (ActionEvent e){

            if (running) {
                move();
                checkApple();
                checkCollisions();
            }
            repaint();
        }
    }










