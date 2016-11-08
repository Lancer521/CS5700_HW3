package FlyWeight;

import java.awt.*;

/**
 * Created by Ty on 11/7/2016 at 4:07 PM.
 */
public class LogoExtrinsicState {

    public LogoExtrinsicState(int x, int y, int width, int height){
        location = new Point(x,y);
        dimension = new Dimension(width, height);
    }

    public Point location;

    public Dimension dimension;

    public boolean isSelected;
}
