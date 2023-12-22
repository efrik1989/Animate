import java.awt.*;

public class LineAnimation extends Animation{
    int x = 0;
    int y = 0;

    public LineAnimation(String image_path) {
        super(image_path);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(image, x,y, this);
    }

    @Override
    public void animate() {
        System.out.println("LineAnimation:::animate");
        x=x+5;
        y=y+5;
        repaint();
    }
}