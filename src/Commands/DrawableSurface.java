package Commands;

import java.awt.event.MouseListener;

/**
 * Created by Ty on 11/3/2016 at 7:08 PM.
 */
public abstract class DrawableSurface implements MouseListener{

    abstract void draw(int xVal, int yVal, int imageKey);

    abstract void select();

    abstract void delete();
}
