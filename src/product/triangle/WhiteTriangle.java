package product.triangle;

public class WhiteTriangle extends Triangle {

    public WhiteTriangle(Double AB, Double BC, Double CA) {
        super(AB, BC, CA);
    }

    @Override
    public Double calculate() {
        if (AB + BC > CA && AB + CA > BC && BC + CA > AB)
            return AB + BC + CA;
        else
            throw new IllegalArgumentException("entity.triangle.Triangle doesn't exist");

    }
}