import javax.swing.*;

public class Window{
    int WIDTH = 500;
    int HEIGHT = 500;


    public Window() {
        LineAnimation lineAnimation = new LineAnimation();
        JFrame frame = new JFrame();
        frame.add(lineAnimation);
        frame.setSize(WIDTH,HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(lineAnimation);
        frame.paint(lineAnimation.getGraphics());
        frame.setVisible(true);
    }
}


