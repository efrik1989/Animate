import java.awt.*;

public class DVDAnimation extends Animation{
    int WIDTH = 1600;
    int HEIGHT = 800;
    Color color;

    public DVDAnimation(String image_path) {
        super(image_path);
        color = Color.black;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(image, x,y, 300,150, color,this);
    }

    @Override
    public void animate() {
        if (y == HEIGHT) {isReverseY = true; changeColor();}
        if (x == WIDTH) {
            isReverseX = true;
            changeColor();
        }
        if (x == START_COORDINATE) {
            isReverseX = false;
            changeColor();
        }
        if (y == START_COORDINATE) {
            isReverseY = false;
            changeColor();
        }

        if (y <= HEIGHT && !isReverseY) y = y + 20;
        if (y >= START_COORDINATE && isReverseY) y = y - 20;
        if (x <= WIDTH && !isReverseX) x = x + 20;
        if (x >= START_COORDINATE && isReverseX) x = x - 20;
        repaint();
    }

    void changeColor() {
        color = new Color((int )(Math.random()*100),(int )(Math.random()*100), (int )(Math.random()*100),(int )(Math.random()*100));
    }
}
