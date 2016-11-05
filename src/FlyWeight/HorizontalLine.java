package FlyWeight;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ty on 11/2/2016 at 7:22 PM.
 */
public class HorizontalLine extends FlyWeight {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(300, 300, 150, 100);
//        g.drawLine(0, 0, 50, 0);
    }

    public static void main(String[] args){
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(300, 300);
        JLabel factory = (FlyWeightFactory.getImage(3));
//        JLabel line = new HorizontalLine();
        jFrame.add(factory);
//        jFrame.add(line);
        jFrame.setVisible(true);
    }
}
