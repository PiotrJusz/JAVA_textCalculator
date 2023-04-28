import java.util.Scanner;

public class textCalc{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        String oper; 
        Operation operation;
        //EnterData enterData;
        //double var1, var2;

        System.out.println("JAVA text Calculator");

        while(true){

            //main menu of app
            System.out.println("Choose math operations:");
            System.out.println("type \'add\' for addition,");
            System.out.println("type \'sub\' for subtraction,");
            System.out.println("type \'mul\' for multlipication,");
            System.out.println("type \'div\' for division,");
            System.out.print("type \'end\' to exit.\n...?: ");
            oper = scan.nextLine();    //request type of operation
            

            //test
            //System.out.println(operation);
            if (oper.toUpperCase().equals("ADD")) {
                //addition
                //request components
                
                operation = new Addition();
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
            // user accidently type somthing wrong
            else{
                System.out.println("Something's wrong. Try again.");

            }
            
        }

        
    }
}