package kelvin.com;

import javax.swing.*;
import java.awt.*;

public class graphics {

    public static JFrame frame=new JFrame();
    graphics(){
        //SwingUtilities.invokeLater())->{
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setLocationRelativeTo(null);


        DrawingPanel panel=new DrawingPanel();
        frame.add(panel);
        frame.setVisible(true);
    }
}
class DrawingPanel extends JPanel {
    @Override
   protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.green);
       // g.drawLine(500,10,200,100);
        //g.fillRect(20, 40, 100, 50);
        //g.drawRect(20,40,100,200);

       // g.drawOval(20,40,100,50);

        String name="gitonga";
        Font font=new Font("Serif",Font.BOLD,25);
        g.setFont(font);
        g.drawString(name,100,100);
    }
}
