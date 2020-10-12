public abstract class Circle {
    protected Double radius;

    Circle(Double radius) {
        this.radius = radius;
    }

    void SetRadius (Double radius){
        this.radius = radius;
    }

    Double GetRadius(){
        return this.radius;
    }

    abstract Double calculate (Double radius);

}
