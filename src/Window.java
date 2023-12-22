import javax.swing.*;
import java.io.File;

public class Window{
    int WIDTH = 500;
    int HEIGHT = 500;
    Animated animated;


    public Window(Animated animated) {
        JFrame frame = new JFrame();
        frame.add((JComponent)animated);
        frame.setSize(WIDTH,HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add((JComponent)animated);
        frame.setVisible(true);
    }
}


