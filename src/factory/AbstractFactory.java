package factory;

import product.circle.Circle;
import product.triangle.Triangle;

public interface AbstractFactory {

    Triangle createTriangle(Double AB, Double BC, Double CA);

    Circle createCircle(Double radius);
}
