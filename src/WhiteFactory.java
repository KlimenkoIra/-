public class WhiteFactory implements AbstractFactory {
    @Override
    public Triangle createTriangle(Double AB, Double BC, Double CA) {
        return new WhiteTriangle(AB, BC, CA);
    }

    @Override
    public Circle createCircle(Double radius) {
        return new WhiteCircle(radius);
    }

}
