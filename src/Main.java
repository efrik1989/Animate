public class Main {
    static String IMAGE_PATH = "C:\\Lin\\balloon.png";


    public static void main(String[] args) {

        LineAnimation lineAnimation = new LineAnimation(IMAGE_PATH);
        Window window = new Window(lineAnimation);
    }
}
