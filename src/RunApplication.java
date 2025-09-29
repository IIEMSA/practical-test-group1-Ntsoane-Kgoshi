import java.util.*;
public class RunApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //declaration of variables
        String nameInput, stadiumInput;
        int runsInput;
        
        //getting the input from the user for the batsman, stadium and total runs. all using the scanner
        System.out.print("The cricketer name: ");
        nameInput = input.nextLine();
        
        System.out.print("Enter the stadium: ");
        stadiumInput = input.nextLine();
        
        System.out.print("Enter the total runs scored by " + nameInput + " at " + stadiumInput + " : ");
        runsInput = input.nextInt();
        input.nextLine();
        
        //instantiating an object of our subclass and calling it's method that will generate our report
        CricketRunsScored cricket = new CricketRunsScored(runsInput, nameInput, stadiumInput);
        
        cricket.printReport();
        
    }
}
