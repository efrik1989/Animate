import java.awt.*;

/**
 * Класс анимации картинки квадратом
 */
public class QuadroAnimation extends Animation{
    int WIDTH = 1000;
    int HEIGHT = 1000;
    boolean isStopY;
    boolean isStopX;

    public QuadroAnimation(String image_path) {
        super(image_path);
        isStopY = true;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(image, x,y, this);
    }

    //TODO: Логика не завершена. Продолжить!!!
    @Override
    public void animate() {
        if (x == 1000) {
            isStopY = false;
            isReverseX = true;
        }
        if (x <= WIDTH && isStopY && !isReverseX) x=x+20;
        y=y+20;
        repaint();
    }
}

