import
public class Main {
    static String IMAGE_PATH = "C:\\Lin\\balloon.png";


    public static void main(String[] args) {
        AnimationFactory animationFactory = new AnimationFactory;
        Animation animation = animationFactory.createAnimation(SUN);
        Window window = new Window(animation);

        //Animation animation = new LineAnimation(IMAGE_PATH);
        //Window window = new Window(animation);

    }
}
