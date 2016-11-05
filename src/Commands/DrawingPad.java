package Commands;

import FlyWeight.FlyWeightFactory;

import javax.swing.*;

/**
 * Created by Ty on 11/3/2016 at 7:09 PM.
 */
public class DrawingPad implements DrawableSurface {

    private JPanel panel;

    public DrawingPad(JPanel panel) {
        this.panel = panel;
        panel.setLayout(null);
    }

    @Override
    public void draw(int xVal, int yVal, int imageKey) {
        JLabel image = FlyWeightFactory.getImage(imageKey);
        if (image == null) return;
        panel.add(image);
        image.setLocation(xVal, yVal);
    }

    @Override
    public void select() {

    }

    @Override
    public void delete() {

    }
}
