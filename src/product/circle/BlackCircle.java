package product.circle;

import java.util.Objects;

public class BlackCircle extends Circle {

    public BlackCircle(Double radius) {
        super(radius);
    }

    @Override
    public Double calculate() {
        if (Objects.isNull(radius))
            throw new IllegalArgumentException("Error: radius is null");
        else if (radius < 0)
            throw new IllegalArgumentException("Error: radius is negative");
        return Math.PI*Math.pow(radius, 2);
    }
}


