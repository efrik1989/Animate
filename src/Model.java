import java.awt.*;

/**
 * Класс шаблон для аобъектов анимации с одинаковой или похожей анимацией
 */
public class Model extends Animation{
    public Model(String imagePath) {
        super(imagePath);
    }

    public Model(String imagePath, int x, int y, int timeout, int radius) {
        super(imagePath, x, y, timeout , radius);
    }
    //TODO: по задумке в класс будут приходить начальные
    // параметр: начальное положение, скорость анимации, путь до картинки,
    // а если получиться указывать разную анимацию при создании вообще красота будет.


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(image, x, y, this);
    }

    @Override
    public void animate() {
        System.out.println("X: " + x + " Y: " + y);
        if (i > 360) i = 0;
        else i++;

        x = (int) (x + radius * Math.cos(i * angle));
        y = (int) (y - radius * Math.sin(i * angle));

        repaint();
    }
}
