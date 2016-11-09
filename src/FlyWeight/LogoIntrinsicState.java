package FlyWeight;

import Utils.ActionConstants;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ty on 11/7/2016 at 4:14 PM.
 */
public class LogoIntrinsicState extends Logo {

    private int type;
    private ImageIcon image;

    public LogoIntrinsicState(final int type) {
        this.type = type;
        retrieveImageLabel();
    }

    private void retrieveImageLabel() {
        String filepath = getFilePath();
        if(filepath != null){
            ImageIcon unscaledImageIcon = new ImageIcon(getFilePath());
            Image scaledImage = unscaledImageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            image = new ImageIcon(scaledImage);
        }
    }

    private String getFilePath() {
        switch (type) {
            case ActionConstants.USU:
                return "src/images/usu.png";
            case ActionConstants.UTAH:
                return "src/images/utah.png";
            case ActionConstants.WEBER:
                return "src/images/weber.png";
            case ActionConstants.UVU:
                return "src/images/uvu.png";
            case ActionConstants.SUU:
                return "src/images/suu.png";
            case ActionConstants.BYU:
                return "src/images/byu.png";
            default:
                System.out.println("INVALID IMAGE TYPE - Could not create image");
                return null;
        }
    }

    public ImageIcon getImage(){
        return image;
    }

    @Override
    public void draw(JPanel panel) {
        System.out.println("Cannot add logo without extrinsic state");
    }

    @Override
    public void erase(JPanel panel) {
        System.out.println("Cannot erase logo without extrinsic state");
    }
}
