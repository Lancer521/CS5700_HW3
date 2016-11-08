package Commands;

import FlyWeight.FlyWeightFactory;
import FlyWeight.LogoBothStates;
import FlyWeight.LogoExtrinsicState;

import javax.swing.*;
import java.awt.event.MouseEvent;

/**
 * Created by Ty on 11/3/2016 at 7:09 PM.
 */
public class DrawingPad extends DrawableSurface {

    private JPanel panel;
    private final int STANDARD_WIDTH = 100;
    private final int STANDARD_HEIGHT = 100;

    public DrawingPad(JPanel panel) {
        this.panel = panel;
        panel.setLayout(null);
    }

    @Override
    public void draw(int xVal, int yVal, int imageKey) {
        LogoExtrinsicState logoExtrinsicState = new LogoExtrinsicState(xVal, yVal, STANDARD_WIDTH, STANDARD_HEIGHT);
        LogoBothStates state = FlyWeightFactory.getImage(imageKey, logoExtrinsicState);
        JLabel image = state.getImageLabel();
        if (image == null) return;
        image.addMouseListener(this);
        panel.add(image);

    }

    @Override
    public void select() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object source = e.getSource();
        if(source instanceof JLabel){
            JLabel label = (JLabel) source;
//            label.setSelected(true);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
