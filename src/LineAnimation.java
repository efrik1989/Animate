import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class LineAnimation extends JComponent implements Animated{
    String IMAGE_PATH = "C:\\Lin\\balloon.png";
    File file = new File(IMAGE_PATH);
    BufferedImage balloon;
    int x = 0;
    int y = 0;

    public LineAnimation() {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                animate();
            }
        };
        try {
            balloon = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Timer timer = new Timer(100, actionListener);
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(balloon, x,y, this);
    }

    @Override
    public void animate() {
        x=x+5;
        y=y+5;
        repaint();
    }
}
