import javax.swing.*;
import java.awt.*;

public class MyJframe extends JFrame  {
    JFrame frame = new JFrame();
    JLabel label;
    Font font = new Font( "Ariel", Font.BOLD, 40 );
    ImageIcon imageIcon;

    public MyJframe() {
        super(" File Edit View Code");   // Frame title
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //setSize(500,300);
        //setLocation(50, 40);
        setBounds(500, 400, 1000, 200);
        setLayout( new FlowLayout());

        //setResizable(false);
        label.setFont(font);

        imageIcon = new ImageIcon( "mdshohed.png");
        label = new JLabel(imageIcon);
        add(label);
        pack();


    }

}
