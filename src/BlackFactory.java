public class BlackFactory implements AbstractFactory {
    @Override
    public Triangle createTriangle(Double AB, Double BC, Double CA) {
        return new BlackTriangle(AB,BC,CA);
    }
    @Override
    public Circle createCircle(Double radius) {
        return new BlackCircle(radius);
    }
}
