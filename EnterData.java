import java.util.Scanner;

public class EnterData {

    int counter = 1;
    double result;
    Scanner scan;

    
    // request for only one double variable, no counter change
    double enterOneDouble(){
        scan = new Scanner(System.in);
        System.out.println("Enter the number of  value: "); 
        result = scan.nextDouble();
        return result;
    }

    double enterDouble(){
        scan = new Scanner(System.in);
        System.out.println("Enter the number of "+this.counter+ " value: "); 
        result = scan.nextDouble();
        
        //increasing counter by 1 or restoration ciunter to 1 
        if (this.counter == 2){
            this.counter = 1;
        }
        else{
            this.counter = this.counter + 1;
        }
        


        return result;
    }

    

    protected void finalize(){
        scan.close();
    }
}
