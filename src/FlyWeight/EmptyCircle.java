package FlyWeight;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ty on 11/2/2016 at 7:16 PM.
 */
public class EmptyCircle extends FlyWeight {

    @Override
    public void drawImage() {
        Graphics g = this.getGraphics();
        g.setColor(Color.BLUE);
        g.drawOval(200, 200, 100, 100);
    }
}
