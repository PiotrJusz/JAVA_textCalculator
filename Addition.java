
//klasa Addition obslugijaca dodawanie
public class Addition implements BasicMathInterface{
   double component1;
   double component2;

   public Addition(){
      this.getComponents();
   }

   //new constructor
   public Addition(double comp1, double comp2){
      this.component1 = comp1;
      this.component2 = comp2;

   }

   public void getComponents(){
      EnterData enterData = new EnterData();
      double var1 = enterData.enterDouble();
      double var2 = enterData.enterDouble();
      this.component1 = var1;
      this.component2 = var2;
   }

   public double getResult(){
      return this.component1 + this.component2;
   }
   

   public void printComponents(){
      System.out.println("Class Addition\nComponent 1 = "+this.component1+"\nComponent 2 = "+this.component2+"\n");
   }
}
