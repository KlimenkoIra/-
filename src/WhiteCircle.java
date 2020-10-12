import java.util.Objects;

public class WhiteCircle implements Circle {
    @Override
    public Double calculate(Double radius) {
        if (Objects.isNull(radius)) {
            System.out.println("Error: radius is null");
        } else if (radius < 0) {
            System.out.println("Error: radius is negative");
        }
        return 2 * Math.PI * radius;
    }
}