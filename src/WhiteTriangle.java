import java.util.Objects;

public class WhiteTriangle implements Triangle {

    @Override
    public Double calculate(Double a, Double b, Double c) {
        if (a + b > c && a + c > b && b + c > a)
            System.out.println("Triangle exists");
        else
            System.out.println("Triangle doesn't exist");
        return a + b + c;
    }
}

