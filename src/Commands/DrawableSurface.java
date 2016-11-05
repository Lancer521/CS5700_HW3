package Commands;

/**
 * Created by Ty on 11/3/2016 at 7:08 PM.
 */
public interface DrawableSurface {

    void draw(int xVal, int yVal, int imageKey);

    void select();

    void delete();
}
