package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Ty on 11/2/2016 at 8:02 PM.
 */
public class Test extends JFrame {

    JButton testButton;

    public Test(){
        this.setSize(800, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("title");

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());

        final JPanel drawingPanel = new JPanel();

        testButton = new JButton("test");
        testButton.addActionListener(e -> {
            Graphics g = drawingPanel.getGraphics();
            g.setColor(Color.BLUE);
            g.drawOval(50,50,50,50);
        });

        contentPane.add(drawingPanel, BorderLayout.CENTER);
        contentPane.add(testButton, BorderLayout.SOUTH);

        this.add(contentPane);
        setVisible(true);
    }

    public static void main(String[] args){
        new Test();
    }
}
