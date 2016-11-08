package FlyWeight;

import javax.swing.*;

/**
 * Created by Ty on 11/7/2016 at 4:14 PM.
 */
public class LogoIntrinsicState {

    public static final int USU = 0;
    public static final int UTAH = 1;
    public static final int WEBER = 2;
    public static final int UVU = 3;
    public static final int SUU = 4;
    public static final int BYU = 5;

    private int type;
    private ImageIcon image;
//    public JLabel label;

    public LogoIntrinsicState(final int type) {
        this.type = type;
        retrieveImageLabel();
    }

    private void retrieveImageLabel() {
        String filepath = getFilePath();
        if(filepath != null){
            image = new ImageIcon(getFilePath());
//            label = new JLabel(image, JLabel.CENTER);
        }
    }

    private String getFilePath() {
        switch (type) {
            case USU:
                return "src/images/usu.png";
            case UTAH:
                return "src/images/utah.png";
            case WEBER:
                return "src/images/weber.png";
            case UVU:
                return "src/images/uvu.png";
            case SUU:
                return "src/images/suu.png";
            case BYU:
                return "src/images/byu.png";
            default:
                System.out.println("INVALID IMAGE TYPE - Could not create image");
                return null;
        }
    }

    public ImageIcon getImage(){
        return image;
    }
}
