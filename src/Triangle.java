public abstract class Triangle {
    protected Double AB, BC, CA;
    Triangle(Double AB, Double BC, Double CA){
        this.AB = AB;
        this.BC = BC;
        this.CA = CA;
    }
    void SetAB(Double AB){
        this.AB = AB;
    }

    void SetBC(Double BC){
        this.BC = BC;
    }

    void SetCA(Double CA){
        this.CA = CA;
    }
    Double GetAB(){
        return this.AB;
    }
    Double GetBC(){
        return this.BC;
    }
    Double GetCA(){
        return this.CA;
    }
    abstract Double calculate();
}
