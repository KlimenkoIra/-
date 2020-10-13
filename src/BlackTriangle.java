import java.util.Objects;

public class BlackTriangle extends Triangle {

    public BlackTriangle(Double AB, Double BC, Double AC) {
        super(AB, BC, AC);
    }

    private Double halfPerimeter(){
        return (AB, BC, AC) / 2;
    }

    @Override
    public String calculate() {
        if (AB + BC > AC && AB + AC > BC && BC + AC > AB)
            return  Math.sqrt(halfPerimeter() * (halfPerimeter() - AB) * (halfPerimeter() - BC) * (halfPerimeter() - AC));
        else
            throw new IllegalArgumentException("Triangle doesn't exist");
    }
}