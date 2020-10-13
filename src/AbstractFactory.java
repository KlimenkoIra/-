public interface AbstractFactory {

    Triangle createTriangle(Double AB, Double BC, Double CA);

    Circle createCircle(Double radius);
}
