package product.triangle;

public class BlackTriangle extends Triangle {

    public BlackTriangle(Double AB, Double BC, Double CA) {
        super(AB, BC, CA);
    }

    private Double halfPerimeter(){
        return (AB + BC + CA) / 2;
    }

    @Override
    public Double calculate() {
        if (AB + BC > CA && AB + CA > BC && BC + CA > AB)
            return  Math.sqrt(halfPerimeter() * (halfPerimeter() - AB) * (halfPerimeter() - BC) * (halfPerimeter() - CA));
        else
            throw new IllegalArgumentException("entity.triangle.Triangle doesn't exist");
    }
}