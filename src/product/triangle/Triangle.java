package product.triangle;

public abstract class Triangle {
    protected Double AB, BC, CA;
    public Triangle(Double AB, Double BC, Double CA){
        this.AB = AB;
        this.BC = BC;
        this.CA = CA;
    }
    public void SetAB(Double AB){
        this.AB = AB;
    }
    public void SetBC(Double BC){
        this.BC = BC;
    }
    public void SetCA(Double CA){
        this.CA = CA;
    }

    public Double GetAB(){
        return this.AB;
    }
    public Double GetBC(){
        return this.BC;
    }
    public Double GetCA(){
        return this.CA;
    }

    public abstract Double calculate();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " with sides: " +
                "AB = " + AB +
                ", BC = " + BC +
                ", CA = " + CA;
    }
}
