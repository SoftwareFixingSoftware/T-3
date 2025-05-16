package kelvin.com;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.Random;

public class samples {
    samples (int width, int height) {
        //frames and its properties in a code
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Image image=new ImageIcon("image.jpg").getImage();
        Random random=new Random();
        int col=random.nextInt(width);
        frame .setIconImage(image);
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);
        frame.setFocusable(true);
        frame.getContentPane();
        frame .setLayout(new GridBagLayout());

        //panel and its properties in a code
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(width, height));
        panel.setForeground(Color.BLACK);
        panel.setBackground(Color.WHITE);
        panel.setIgnoreRepaint(true);
        panel.setOpaque(false);
        panel.setLayout(new GridBagLayout());
        frame.add(panel);

        JLabel label = new JLabel();
        label.setText("Hello World");
        label.getText();
        label.setIcon(new ImageIcon("image.jpg"));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setForeground(Color.BLACK);
        label.setBackground(Color.WHITE);
        label.setOpaque(true);
        label.setFocusable(true);
        label.setPreferredSize(new Dimension(width, height));
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        frame.add(label);


        JButton button = new JButton();
        button.setText("Click Me");
        button.setBackground(Color.WHITE);
        button.setForeground(Color.BLACK);
        button.setOpaque(true);
        button.setFocusable(true);
        button.setPreferredSize(new Dimension(width, height));
        frame.add(button);


        JButton submitBtn = new JButton();
        submitBtn.setBackground(Color.BLACK);
        submitBtn .setForeground(Color.red);
        submitBtn.setOpaque(true);
        submitBtn.setFocusable(true);
        submitBtn.setSize(new Dimension(40,60));
        submitBtn.setBorder(new LineBorder(Color.BLACK));
        submitBtn.setPreferredSize(new Dimension(width, height));
        frame.add(submitBtn);
        frame.setVisible(true);


        //getters and setters
    }
}


