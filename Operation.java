public class Operation /*implements BasicMathInterface*/ {

    double component1;
    double component2; 

    public void getComponents(){
        EnterData enterData = new EnterData();
        double var1 = enterData.enterDouble();
        double var2 = enterData.enterDouble();
        this.component1 = var1;
        this.component2 = var2;
    };
    public double getResult(){
        double k = 0.0;
        return k;
    };
    public void printComponents(){
        System.out.println("Class "+this.getClass().getName()+"\nComponent 1 = "+this.component1+"\nComponent 2 = "+this.component2+"\n");
    };
    
}
