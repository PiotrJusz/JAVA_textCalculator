public class CalcMemory{
    //variable stored current number which user ask to remeber
    double memory = 0;

    //constructor, n'num' is number given by user
    public CalcMemory(double num){
        this.memory = num;
    }

    public void setMemory(double num){
        this.memory = num;
    }

    //delete memory (set as 0)
    public void resetMemory(){
        this.memory = 0;
    }

    //get number which is already stored in variable 'memory' 
    public double getMemory(){
        return this.memory;
    }

    // print stored valuu (memory recal, 'mr')
    public void printMemory(){
        System.out.println("Stored value: "+this.getMemory());
    }




}
