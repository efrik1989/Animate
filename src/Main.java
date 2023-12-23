public class Main {
    static String IMAGE_PATH = "C:\\Lin\\balloon.png";


    public static void main(String[] args) {

        Animation animation = new QuadroAnimation(IMAGE_PATH);

        Window window = new Window(animation);
    }
}
