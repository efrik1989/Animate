import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Класс каркас для анимаций картинки.
 */
public abstract class Animation extends JComponent implements Animated{
    int timeout = 100;
    BufferedImage image;
    final int START_COORDINATE = 0;
    int x = START_COORDINATE;
    int y = START_COORDINATE;
    boolean isReverseY;
    boolean isReverseX;
    boolean isStopY;
    boolean isStopX;

    public Animation(String image_path) {
        File file = new File(image_path);
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                animate();
            }

        };
        try {
            image = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Timer timer = new Timer(timeout, actionListener);
        timer.start();
    }

    public Animation() {

    }

    public Animation(int timeout, BufferedImage image, int x, int y) {
        this.timeout = timeout;
        this.image = image;
        this.x = x;
        this.y = y;
    }
}
