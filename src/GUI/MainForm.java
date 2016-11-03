package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Ty on 11/1/2016 at 11:59 PM.
 */
public class MainForm implements ActionListener {
    private JFrame frame;
    private JButton diagonalRightLine;
    private JButton emptyCircle;
    private JButton diagonalLeftLine;
    private JButton verticalLine;
    private JButton horizontalLine;
    private JButton filledCircle;
    private JPanel panelMain;
    private JPanel drawingPanel;
    private JPanel buttonPanel;
    private JButton save;
    private JButton load;
    private JButton undo;


    public MainForm() {
        frame = new JFrame();
        frame.setContentPane(panelMain);
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Stick Man Sketch Book");

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem newMenuItem = new JMenu("New");

        //newMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_CONTROL, InputEvent.CTRL_MASK));
        menu.add(newMenuItem);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        setActionListeners();


        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MainForm();
    }

    private void setActionListeners() {
        diagonalRightLine.addActionListener(this);
        emptyCircle.addActionListener(this);
        diagonalLeftLine.addActionListener(this);
        verticalLine.addActionListener(this);
        horizontalLine.addActionListener(this);
        filledCircle.addActionListener(this);
        save.addActionListener(this);
        load.addActionListener(this);
        undo.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object eventObject = e.getSource();
        if (eventObject == save) {

        } else if (eventObject == load) {

        } else if (eventObject == undo) {

        } else if (eventObject == emptyCircle) {
            // TODO: Change pointer icon
        } else if (eventObject == filledCircle) {
            // TODO: Change pointer icon
        } else if (eventObject == verticalLine) {
            // TODO: Change pointer icon
        } else if (eventObject == horizontalLine) {
            // TODO: Change pointer icon
        } else if (eventObject == diagonalLeftLine) {
            // TODO: Change pointer icon
        } else if (eventObject == diagonalRightLine) {
            // TODO: Change pointer icon
        }
    }
}
