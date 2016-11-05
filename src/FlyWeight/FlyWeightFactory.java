package FlyWeight;

import javax.swing.*;
import java.util.HashMap;

/**
 * Created by Ty on 11/2/2016 at 7:27 PM.
 */
public class FlyWeightFactory {

    public static final int EMPTY_CIRCLE = 0;
    public static final int FILLED_CIRCLE = 1;
    public static final int VERT_LINE = 2;
    public static final int HORIZ_LINE = 3;
    public static final int DIAG_LEFT = 4;
    public static final int DIAG_RIGHT = 5;

    private static final HashMap<Integer, FlyWeight> objectsByType = new HashMap<>();

    public static JLabel getImage(final int key) {

        FlyWeight flyWeightObj = objectsByType.get(key);

        if (flyWeightObj == null) {
            switch (key) {
                case EMPTY_CIRCLE:
                    flyWeightObj = new EmptyCircle();
//                    flyWeightObj.drawImage();
                    objectsByType.put(EMPTY_CIRCLE, flyWeightObj);
                    break;
                case FILLED_CIRCLE:
                    flyWeightObj = new FilledCircle();
//                    flyWeightObj.drawImage();
                    objectsByType.put(FILLED_CIRCLE, flyWeightObj);
                    break;
                case VERT_LINE:
                    flyWeightObj = new VerticalLine();
//                    flyWeightObj.drawImage();
                    objectsByType.put(VERT_LINE, flyWeightObj);
                    break;
                case HORIZ_LINE:
                    flyWeightObj = new HorizontalLine();
//                    flyWeightObj.drawImage();
                    objectsByType.put(HORIZ_LINE, flyWeightObj);
                    break;
                case DIAG_LEFT:
                    flyWeightObj = new DiagonalLeftLine();
//                    flyWeightObj.drawImage();
                    objectsByType.put(DIAG_LEFT, flyWeightObj);
                    break;
                case DIAG_RIGHT:
                    flyWeightObj = new DiagonalRightLine();
//                    flyWeightObj.drawImage();
                    objectsByType.put(DIAG_RIGHT, flyWeightObj);
                    break;
                default:
                    System.out.println("ERROR: FlyWeightFactory default block reached");
                    return null;
            }
        }

        return flyWeightObj;
    }
}
