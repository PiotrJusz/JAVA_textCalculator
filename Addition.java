
//klasa Addition obslugijaca dodawanie
public class Addition extends Operation{
  

   public Addition(){
      super();
   }

   public Addition(double comp1, double comp2){
      super(comp1, comp2);
   }


   public double getResult(){
      this.lastResult = this.component1 + this.component2;
      this.workingProgress = true;
      return this.lastResult;
   }
   

   
}
