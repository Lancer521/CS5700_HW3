package Commands;

/**
 * Created by Ty on 11/3/2016 at 6:33 PM.
 */
public class AddToCanvasCommand implements Command {

    private DrawableSurface surface;
    private int imageKey;

    public AddToCanvasCommand(DrawableSurface newSurface, int key) {
        surface = newSurface;
        imageKey = key;
    }

    @Override
    public void execute(int xVal, int yVal) {
        surface.draw(xVal, yVal, imageKey);
    }

    @Override
    public void undo() {

    }
}
