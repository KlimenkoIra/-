import java.util.Objects;

public class BlackCircle implements Circle {
    @Override
    public Double calculate(Double radius) {
        if (radius <=0) {
            System.out.println("Error: radius is incorrectly specified");
        }
       return Math.PI*Math.pow(radius, 2);
    }
}
