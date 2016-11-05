package Commands;

/**
 * Created by Ty on 11/3/2016 at 7:35 PM.
 */
public class SelectImageCommand implements Command {

    private DrawableSurface surface;

    public SelectImageCommand(DrawableSurface newSurface) {
        surface = newSurface;
    }

    @Override
    public void execute(int xVal, int yVal) {

    }

    @Override
    public void undo() {

    }
}
