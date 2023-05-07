import java.util.Scanner;

public class textCalc{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        String oper; 
        Operation operation = new Operation(0, 0);
        CalcMemory calcMemory = new CalcMemory(0);
        double resultOfLastOperation = 0;
        

        //EnterData enterData;
        //double var1, var2;

        System.out.println("JAVA text Calculator");

        while(true){

            //main menu of app
            System.out.println("\nChoose math operations:");
            System.out.println("type \'add\' for addition,");
            System.out.println("type \'sub\' for subtraction,");
            System.out.println("type \'mul\' for multlipication,");
            System.out.println("type \'div\' for division,");
            System.out.println("type \'m\' to add number to M,");
            
            //printing extra menu when stored memory isn't 0
            if (calcMemory.getMemory() != 0){
                System.out.println("type \'m+\' to add last result number to M,");
                System.out.println("type \'m-\' to substract from M,");
                System.out.println("type \'m*\' for multiply by M");
                System.out.println("type \'m/\' to divide by M,");
                System.out.println("type \'mr\' to recall stored value,");
            }
            // printing menu for adding number(last result) to memory
            if(operation.workingProgress == true){
                System.out.println("type \'mw\' for remember last result in memory.");
            }

            System.out.print("type \'end\' to exit.\n...?: ");

            oper = scan.nextLine();    //request type of operation
            

            //test
            //System.out.println(operation);
            if (oper.toUpperCase().equals("ADD")) {
                //addition
                //request components
                
                operation = new Addition();
                resultOfLastOperation = operation.getResult();
                System.out.println("Result: "+operation.getResult());
                //addition.setComponents(addition.setComponent(), addition.setComponent());
            }
            //subtraction service
            else if(oper.toUpperCase().equals("SUB")){
                operation = new Subtraction();
                System.out.println("Result: "+operation.getResult());

            }
            else if(oper.toUpperCase().equals("MUL")){
                operation = new Multiplication();
                System.out.println("Result: "+operation.getResult());

            }
            else if(oper.toUpperCase().equals("DIV")){
                operation = new Division();
                System.out.println("Result: "+operation.getResult());

            }
            //user type 'end'
            else if(oper.toUpperCase().equals("END")){
                System.out.println("End of program.");
                System.out.println("author: Piotr Juszczak");
                scan.close();
                System.exit(0);
            }

            

            // calculator memory
            else if (oper.toUpperCase().equals("M+")){
                operation = new Addition(resultOfLastOperation, calcMemory.getMemory());
                resultOfLastOperation = operation.getResult();
                calcMemory.setMemory(resultOfLastOperation);
                // tests
                System.out.println("resultOfLastOperation: "+resultOfLastOperation+"\ncalcMemory.getMemory(): "+calcMemory.getMemory());


                // System.out.println("Number "+calcMemory.getMemory()+" is stored now in memory.");
            }
            // calculator memory - write in 'memory' only last result (delete last 'memory')
            else if (oper.toUpperCase().equals("MW")){
                resultOfLastOperation = operation.getResult();
                calcMemory.setMemory(resultOfLastOperation);
                // System.out.println("Number "+calcMemory.getMemory()+" is stored now in memory.");
            }

            //add number to m
            else if(oper.toUpperCase().equals("M")){
                operation.getComponent();
                calcMemory.setMemory(operation.getComponent1());
                // System.out.println("Number "+calcMemory.getMemory()+" is stored now in memory.");
            }
            // memory recall
            else if (oper.toUpperCase().equals("MR")){
                calcMemory.printMemory();
            }

            // substract from m (M-)
            else if (oper.toUpperCase().equals("M-")){
                // when 
                operation = new Subtraction(calcMemory.getMemory(), resultOfLastOperation);
                
                resultOfLastOperation = operation.getResult();
                calcMemory.setMemory(resultOfLastOperation);
                // tests
                System.out.println("resultOfLastOperation: "+resultOfLastOperation+"\ncalcMemory.getMemory(): "+calcMemory.getMemory());


                // System.out.println("Number "+calcMemory.getMemory()+" is stored now in memory.");
            }
            // multiplacation by m
            else if(oper.toUpperCase().equals("M*")){
                operation = new Multiplication(calcMemory.getMemory(), resultOfLastOperation);
                
                resultOfLastOperation = operation.getResult();
                calcMemory.setMemory(resultOfLastOperation);
                // tests
                System.out.println("resultOfLastOperation: "+resultOfLastOperation+"\ncalcMemory.getMemory(): "+calcMemory.getMemory());
            }
            // division M by number(last_result)
            else if(oper.toUpperCase().equals("M/")){

                operation = new Division(calcMemory.getMemory(), resultOfLastOperation);
                
                resultOfLastOperation = operation.getResult();
                calcMemory.setMemory(resultOfLastOperation);
                // tests
                System.out.println("resultOfLastOperation: "+resultOfLastOperation+"\ncalcMemory.getMemory(): "+calcMemory.getMemory());
            }
            // user accidently type somthing wrong
            else{
                System.out.println("Something's wrong. Try again.");

            }

            
            
        }

        
    }
}