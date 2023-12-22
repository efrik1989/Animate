import java.awt.*;

public class QuadroAnimation extends Animation{
    int x = 0;
    int y = 0;

    public QuadroAnimation(String image_path) {
        super(image_path);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(image, x,y, this);
    }

    @Override
    public void animate() {
        x=x+5;
        y=y+5;
        repaint();
    }
}

