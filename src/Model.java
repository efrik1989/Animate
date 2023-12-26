/**
 * Класс шаблон для аобъектов анимации с одинаковой или похожей анимацией
 */
public class Model extends Animation{
    double angle = 6;
    double radius;
    int i = 0;
    //TODO: по задумке в класс будут приходить начальные
    // параметр: начальное положение, скорость анимации, путь до картинки,
    // а если получиться указывать разную анимацию при создании вообще красота будет.


    @Override
    public void animate() {
        if (i > 0) i = 0;
        else i++;

        x = (int) (x + radius * Math.cos(i * angle));
        y = (int) (y - radius * Math.sin(i * angle));

        repaint();
    }
}
