import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        Myframe myframe = new Myframe();
    }
}

class Myframe extends JFrame {
    JButton button1, button2, button3;
    Container container;

    public Myframe() {
        setTitle( "Button Design");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize( 500, 500);
        setLocationRelativeTo(null);
        setLayout(null);

        container = getContentPane();

        button1 = new JButton("Button1");
        button2 = new JButton("Button2");
        button3 = new JButton("Button3");

        button1.setBounds(10,10,80,30);
        button2.setBounds(110,10,80,30);
        button3.setBounds(210,10,80,30);

        add(button1);
        add(button2);
        add(button3);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                container.setBackground( Color.pink);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                container.setBackground( Color.green);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                container.setBackground( Color.blue);
            }
        });

    }
}
