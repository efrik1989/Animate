import javax.swing.*;

public class Window{
    static int WIDTH = 1920;
    static int HEIGHT = 1080;

    public Window(Animated...animated) {
        JFrame frame = new JFrame();
        frame.setSize(WIDTH,HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        for (Animated ani : animated) {
            frame.add((JComponent) ani);
            frame.getContentPane().add((JComponent) ani);
        }
        frame.setVisible(true);
    }
}


