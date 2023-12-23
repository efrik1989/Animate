import java.awt.*;

/**
 * Класс анимации картинки квадратом
 */
public class QuadroAnimation extends Animation{
    int WIDTH = 700;
    int HEIGHT = 700;
    int START_COORDINATE = 0;

    public QuadroAnimation(String image_path) {
        super(image_path);
        isStopY = true;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(image, x,y, this);
    }

    @Override
    public void animate() {
        if (x == WIDTH && y == START_COORDINATE) {
            isStopY = false;
            isReverseX = true;
            isStopX = true;
        }
        if (y == HEIGHT && x == WIDTH) {
            isStopX = false;
            isReverseY = true;
            isStopY = true;
        }
        if (y == HEIGHT && x == START_COORDINATE) {
            isStopX = true;
            isReverseX = false;
            isStopY = false;
        }
        if (y == START_COORDINATE && x == START_COORDINATE) {
            isStopX = false;
            isReverseY = false;
            isStopY = true;
        }

        if (x <= WIDTH && !isStopX && !isReverseX) x=x+20;
        if (x >= START_COORDINATE && !isStopX && isReverseX) x=x-20;
        if (y <= HEIGHT && !isStopY && !isReverseY) y=y+20;
        if (y >= START_COORDINATE && !isStopY && isReverseY) y=y-20;
        repaint();
    }
}

