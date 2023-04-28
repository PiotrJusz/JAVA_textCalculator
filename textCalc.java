import java.util.Scanner;

public class textCalc{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        String operation; 
        Addition addition;
        //EnterData enterData;
        //double var1, var2;

        System.out.println("JAVA text Calculator");

        //main menu of app
        System.out.println("Choose math operations:");
        System.out.println("type \'add\' for addition,");
        System.out.println("type \'sub\' for subtraction.");
        operation = scan.nextLine();    //request type of operation
        

        //test
        //System.out.println(operation);
        if (operation.toUpperCase().equals("ADD")) {
            //addition
            //request components
            
            addition = new Addition();
            addition.printComponents();
            System.out.println("Result: "+addition.getResult());
            //addition.setComponents(addition.setComponent(), addition.setComponent());
        }
        //subtraction service
        else if(operation.toUpperCase().equals("SUBTRACTION")){
            
        }


        

        scan.close();
    }
}