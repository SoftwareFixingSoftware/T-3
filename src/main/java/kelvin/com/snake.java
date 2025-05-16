package kelvin.com;


import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import java.util.Set;



public class snake {
    snake (int width,int height){
    JFrame frame=new JFrame("Snake");
    frame.setSize(width,height);
    Image image=new ImageIcon("Snake.png").getImage();
    frame.setIconImage(image);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Random random = new Random();
    int color=random.nextInt(255);
    frame.getContentPane().setBackground(new Color(color,color,color));
    frame.setMinimumSize(new Dimension(width,height));
    frame.setLocationRelativeTo(null);
    frame.setResizable(true);
    frame.setLayout(new FlowLayout());





       /* JPanel panel=new JPanel();
        panel.setBackground(Color.green);
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.add(new JButton("Button 1"));
        panel.add(Box.createVerticalStrut(30));
        panel.add(new JButton("Button 2"));
        panel.add(Box.createVerticalStrut(10));
        panel.add(new JButton("Button 3"));
        panel.add(Box.createVerticalStrut(10));
        panel.add(new JButton("Button 4"));
        panel.add(Box.createVerticalStrut(10));
        panel.setPreferredSize(new Dimension( 800, 600));
        frame.add(panel);
        frame.setVisible(true);*/

       /* JPanel panel=new JPanel(new GridBagLayout());
        GridBagConstraints c=new GridBagConstraints();
        c.fill=GridBagConstraints.HORIZONTAL;
        c.insets=new Insets(5,5,5,5);
        c.gridx=0;
        c.gridy=0;
        panel.add(new JButton("button 1"),c);
        c.gridx=1;
        c.gridy=0;
        panel.add(new JButton("button 2"),c);
        c.gridx=0;
        c.gridy=1;
        panel.add(new JButton("button 3"),c);
        c.gridx=1;
        c.gridy=1;
        panel.add(new JButton("button 4"),c);
        frame.add(panel,c);
        frame.setVisible(true);*/

        JPanel panel=new JPanel(new FlowLayout());
        panel.setBackground(Color.WHITE);
        panel.setOpaque(true);
        panel.setPreferredSize(new Dimension(400,400));

        JLabel label=new JLabel("Buttons");
        label.setPreferredSize(new Dimension(200,200));
        label.setForeground(Color.red);
        label.setFont(new Font("Arial",Font.BOLD,20));
        label.setBackground(Color.yellow);
        label.setOpaque(true);
        panel.add(label);




        JButton submitBtn=new JButton("Submit");
        submitBtn.setForeground(Color.red);
        submitBtn.setFont(new Font("Arial",Font.BOLD,10));
        submitBtn.setBackground(Color.yellow);
        submitBtn.setOpaque(true);
        submitBtn.setFocusable(false);
        submitBtn.setBorder(new LineBorder(Color.black));
        submitBtn.setSize(new Dimension(100,80));
        submitBtn.addMouseListener(new MouseAdapter() {

           // @Override
            //public void mouseClicked(MouseEvent e){

           // }
            //@Override
            //public void  mousePressed(MouseEvent e){

           // }
           // @Override
            //public void mouseReleased(MouseEvent e){

           // }
            //@ override is used to override a method or an interface of a parent class that is it is used
            //toin a subclass of a parent class with the same name but has to be displayed
            @Override
            public void mouseEntered(MouseEvent e){
                submitBtn.setForeground(Color.red);
                submitBtn.setBackground(Color.white);

            }
            public void mouseExited(MouseEvent e){
                submitBtn.setForeground(Color.white);
                submitBtn.setBackground(Color.black);

            }

        });

        //this is the action listener code before being updated to the code written below
        //submitBtn.addActionListener(new ActionListener() {
           // @Override
           // public void actionPerformed(ActionEvent e) {
                //the updated action listener
                submitBtn.addActionListener(e->
                        JOptionPane.showMessageDialog(null,"you clicked submit button!","info",JOptionPane.INFORMATION_MESSAGE));


               // })

           // }


        frame.add(panel);
        panel.add(submitBtn);
        frame.setVisible(true);













    }
}