import java.util.Objects;

public class WhiteTriangle implements Triangle {

    public WhiteTriangle(Double AB, Double BC, Double AC) {
        super(AB, BC, AC);
    }
    @Override
    public Double calculate() {
        if (AB + BC > AC && AB + AC > BC && BC + AC > AB)
            return AB + BC + AC;
        else
            throw new IllegalArgumentException("Triangle doesn't exist");
    }
}

