public class Division extends Operation {
    public Division(){
        super();
    }

    public Division(double comp1, double comp2) {
        super(comp1, comp2);
    }

    public double getResult(){
        this.lastResult = this.component1 / this.component2;
        this.workingProgress = true;
        return this.lastResult;
    }
}
