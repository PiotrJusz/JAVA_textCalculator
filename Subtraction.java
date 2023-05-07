public class Subtraction extends Operation{

    public Subtraction(){
        super();
    }

    public Subtraction(double comp1, double comp2){
        super(comp1, comp2);
    }

    /*public Subtraction(){
        this.getComponents();
    }

    //new constructor
    public Subtraction(double comp1, double comp2){
        this.component1 = comp1;
        this.component2 = comp2;

    

    public void getComponents(){
        EnterData enterData = new EnterData();
        double var1 = enterData.enterDouble();
        double var2 = enterData.enterDouble();
        this.component1 = var1;
        this.component2 = var2;
    }}*/

    public double getResult(){
        this.lastResult = this.component1 - this.component2;
        this.workingProgress = true;
        return this.lastResult;
    }

    
    
}
