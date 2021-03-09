import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        Myframe myframe = new Myframe();
    }
}

class Myframe extends JFrame implements ActionListener{
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

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if ( e.getSource()==button1) {
            container.setBackground(Color.green);
        }
        if ( e.getSource()==button2) {
            container.setBackground(Color.blue);
        }
        if ( e.getSource()==button3) {
            container.setBackground(Color.pink);
        }
    }
}
