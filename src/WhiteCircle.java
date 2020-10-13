import java.util.Objects;

public class WhiteCircle extends Circle {

    public WhiteCircle(Double radius) {
        super(radius);
    }

    @Override
    public Double calculate() {
        if (Objects.isNull(radius))
            throw new IllegalArgumentException("Error: radius is null");
        else if (radius < 0)
            throw new IllegalArgumentException("Error: radius is negative");
        return 2 * Math.PI * radius;
    }
}