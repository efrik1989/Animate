import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public abstract class Animation extends JComponent implements Animated{
    int TIMEOUT = 100;
    BufferedImage image;
    int x = 0;
    int y = 0;

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

        Timer timer = new Timer(TIMEOUT, actionListener);
        timer.start();
    }

}
