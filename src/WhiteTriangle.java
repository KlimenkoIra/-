import java.util.Objects;

public class WhiteTriangle extends Triangle {

    public WhiteTriangle(Double AB, Double BC, Double CA) {
        super(AB, BC, CA);
    }

    @Override
    public Double calculate() {
        if (AB + BC > CA && AB + CA > BC && BC + CA > AB)
            return perimeter = AB + BC + AC;
        else
            throw new IllegalArgumentException("Triangle doesn't exist");

    }
}