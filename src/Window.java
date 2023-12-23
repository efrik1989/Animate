import javax.swing.*;

public class Window{
    int WIDTH = 1920;
    int HEIGHT = 1080;

    public Window(Animated animated) {
        JFrame frame = new JFrame();
        frame.add((JComponent)animated);
        frame.setSize(WIDTH,HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add((JComponent)animated);
        frame.setVisible(true);
    }
}


