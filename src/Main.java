public class Main {
    static String IMAGE_PATH = "C:\\Lin\\DVD_logo.svg.png";


    public static void main(String[] args) {

        Animation animation = new DVDAnimation(IMAGE_PATH);
        Window window = new Window(animation);

    }
}
