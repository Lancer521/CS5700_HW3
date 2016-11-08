package FlyWeight;

import javax.swing.*;

/**
 * Created by Ty on 11/8/2016 at 1:52 AM.
 */
public class LogoBothStates {

    private JLabel label;

    private LogoIntrinsicState intrinsicState;
    public LogoExtrinsicState extrinsicState;

    public LogoBothStates(LogoIntrinsicState logoIntrinsicState, LogoExtrinsicState logoExtrinsicState) {
        intrinsicState = logoIntrinsicState;
        extrinsicState = logoExtrinsicState;

        label = new JLabel(intrinsicState.getImage());
        label.setLocation(extrinsicState.location);
        label.setSize(extrinsicState.dimension);
    }

    public JLabel getImageLabel() {
        return label;
    }
}
