package Commands;

/**
 * Created by Ty on 11/3/2016 at 6:24 PM.
 */
public interface Command {

    void execute(int xVal, int yVal);

    void undo();
}
