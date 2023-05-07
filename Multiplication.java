public class Multiplication extends Operation{
    public Multiplication(){
        super();
    }

    public Multiplication(double comp1, double comp2){
        super(comp1, comp2);
    }

    public double getResult(){
        this.lastResult = this.component1 * this.component2;
        this.workingProgress = true;
        return this.lastResult;
    }
}
