package product.circle;

public abstract class Circle {
    protected Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public void SetRadius (Double radius){
        this.radius = radius;
    }

    public Double GetRadius(){
        return this.radius;
    }

    public abstract Double calculate();

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+ " with " +
                "radius = " + radius;
    }
}
