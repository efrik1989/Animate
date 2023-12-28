/**
 * Класс создает объекты анимации типа Model.
 */
public class AnimationFactory {
    //TODO: реализовать патерн Factory.
    // Пока ничего лучше не придумал как менять анимацию от модели к модели боле гибко.
    // Стоит подумать еще немного.
    public Animation createAnimation(AnimationType type) {
        Animation animation;
        switch (type) {
            case MARS:
                animation = new MarsAnimation();
                break;
            case EARTH:
                animation = new EarthAnimation();
                break;
            case VENUS:
                animation = new VenusAnimation();
                break;
            case SATURN:
                animation = new SaturnAnimation();
                break;
            case URANUS:
                animation = new UranusAnimation();
                break;
            case JUPITER:
                animation = new JupiterAnimation();
            case MERCURY:
                animation = new MercuryAnimation();
                break;
            case NEPTUNE:
                animation = new NeptuneAnimation();
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
        return animation;
    }
}
