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
    public int x = START_COORDINATE;
    public int y = START_COORDINATE;
    boolean isReverseY;
    boolean isReverseX;
    boolean isStopY;
    boolean isStopX;
    String image_path;
    double angle = 6;
    double radius = 50;
    int i = 0;

    public Animation(String image_path) {
        this.image_path = image_path;
        loadImage();
        animationInit();
    }

    public Animation(String image_path, int x, int y, int timeout, int radius) {
        this.timeout = timeout;
        this.image_path = image_path;
        this.x = x;
        this.y = y;
        this.radius = radius;
        loadImage();
        animationInit();
    }
    public Animation() {
    }

    protected void animationInit() {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                animate();
            }

        };
        Timer timer = new Timer(timeout, actionListener);
        timer.start();
        System.out.println("Animation is start.");
    }

    protected void loadImage() {
        File file = new File(image_path);
        try {
            image = ImageIO.read(file);
            System.out.println("Load image... done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
