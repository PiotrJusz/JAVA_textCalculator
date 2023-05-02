public class Operation /*implements BasicMathInterface*/ {

    double component1;
    double component2; 
    // variable 'lastResult stored last result of math operation'
    double lastResult = 0;
    boolean workingProgress = false;
    EnterData enterData;

    // constructor with numbers
    public Operation(double comp1, double comp2){
        this.component1 = comp1;
        this.component2 = comp2;
    }

    public Operation(){
        this.getComponents();

    }

    public Operation(double[] set){
        this.component1 = set[0];
        this.component2 = set[1];
    }
    

    public void getComponents(){
        enterData = new EnterData();
        double var1 = enterData.enterDouble();
        double var2 = enterData.enterDouble();
        this.component1 = var1;
        this.component2 = var2;
    }

    public double getComponent1(){
        return this.component1;
    }

    // get only one component
    public void getComponent(){
        enterData = new EnterData();
        double var1 = enterData.enterOneDouble();
        // double var2 = enterData.enterDouble();
        this.component1 = var1;
        this.component2 = 0;
    }

    
    public double getResult(){
        double k = 0.0;
        // this.lastResult = k;
        return k;
    }

    // get last result from math operation
    public double getLastResult(){
        return this.lastResult;
    }
    public void printComponents(){
        System.out.println("Class "+this.getClass().getName()+"\nComponent 1 = "+this.component1+"\nComponent 2 = "+this.component2+"\n");
    }
    
}
