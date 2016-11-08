package GUI;

import Commands.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import FlyWeight.*;

/**
 * Created by Ty on 11/1/2016 at 11:59 PM.
 */
public class MainForm implements ActionListener, MouseListener {
    private JFrame frame;
    private JButton diagonalRightLine;
    private JButton emptyCircle;
    private JButton diagonalLeftLine;
    private JButton verticalLine;
    private JButton horizontalLine;
    private JButton filledCircle;
    private JPanel contentPane;
    private JPanel drawingPanel;
    private JPanel buttonPanel;
    private JButton save;
    private JButton load;
    private JButton undo;
    private JButton selectionMode;

    private Graphics graphics;
    private DrawingPad drawingPad;

    private int imageKey = -1;
    private boolean buttonClicked;

    public MainForm() {
        frame = new JFrame();
        frame.setContentPane(contentPane);
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

        frame.addMouseListener(this);

        drawingPad = new DrawingPad(drawingPanel);

        /*ImageIcon image = new ImageIcon("src/images/USU.png");
        JLabel test = new JLabel(image, JLabel.CENTER);
        test.setSize(20, 20);
        test.setLocation(100, 100);
        drawingPanel.add(test);*/

        setActionListeners();


        frame.setVisible(true);
    }

    public static void main(String[] args) {
        MainForm form = new MainForm();
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
        selectionMode.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object eventObject = e.getSource();

        if (eventObject == save) {
            buttonClicked = true;
            //TODO: save
        } else if (eventObject == load) {
            buttonClicked = true;
            //TODO: load
        } else if (eventObject == undo) {
            buttonClicked = true;
            //TODO: undo
        } else if (eventObject == selectionMode) {
            buttonClicked = true;
            imageKey = -1;
        } else if (eventObject == emptyCircle) {
            buttonClicked = true;
            imageKey = LogoIntrinsicState.USU;
        } else if (eventObject == filledCircle) {
            buttonClicked = true;
            imageKey = LogoIntrinsicState.UTAH;
        } else if (eventObject == verticalLine) {
            buttonClicked = true;
            imageKey = LogoIntrinsicState.WEBER;
        } else if (eventObject == horizontalLine) {
            buttonClicked = true;
            imageKey = LogoIntrinsicState.UVU;
        } else if (eventObject == diagonalLeftLine) {
            buttonClicked = true;
            imageKey = LogoIntrinsicState.SUU;
        } else if (eventObject == diagonalRightLine) {
            buttonClicked = true;
            imageKey = LogoIntrinsicState.BYU;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        Command command;
        if (imageKey == -1) {
            command = new SelectImageCommand(drawingPad);
        } else {
            command = new AddToCanvasCommand(drawingPad, imageKey);
        }
        Invoker invoker = new Invoker(command, e.getX()-buttonPanel.getWidth()-20, e.getY()-50);
        invoker.invoke();
        drawingPanel.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //NO-OP
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //NO-OP
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //NO-OP
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //NO-OP
    }
}
