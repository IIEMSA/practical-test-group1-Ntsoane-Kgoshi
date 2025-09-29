import java.util.*;

public class Q1_Batsmen {
    public static void main(String[] args) {
        //declaring scanner and the relevant inputs, intialising some
        Scanner input = new Scanner(System.in);
        
        int userRuns , mostRuns = 0, mostRunsIndex = 0, countRuns = 0;
        
        //delcaring our 2d and 1d arrays that will be used
        int[][] runs = new int[3][3];
        int[] totalRuns = new int[3];
        
        String[] batsmen = {"Jacques Kallis", "Hashim Amla", "AB de Villiers"};
        String[] stadiums = {"KINGSMEAD", "St GEORGES", "WANDERERS"};
        
        System.out.println("SA CRICKETER APPLICATION");
        System.out.println("------------------------------------------------------------");
        
        //populating our 2d array by looping through it
        for (int col = 0; col < runs[0].length; ++col) {
            for (int row = 0; row < runs.length; ++row) {
                System.out.print("Enter the number of runs scored by " + batsmen[row] + " at " + stadiums[col] + " : ");
                userRuns = input.nextInt();
                input.nextLine();
                
                runs[row][col] = userRuns;
                
                //our running total for each stadoium
                countRuns += userRuns;
                
            }
            
            //populating the array used for the total of each stadium
            totalRuns[col] = countRuns;
            countRuns = 0;
        }
        
        //generating our report which includes all the values in our 2d array and the total runs of each stadium in our 1d array
        System.out.println("------------------------------------------------------------");
        System.out.println("RUNS SCORED REPORT");
        System.out.println("------------------------------------------------------------");
        System.out.println("");
        
        
        System.out.println(batsmen[0] + " runs scored at " + stadiums[0] + " : " + runs[0][0]);
        System.out.println(batsmen[0] + " runs scored at " + stadiums[1] + " : " + runs[0][1]);
        System.out.println(batsmen[0] + " runs scored at " + stadiums[2] + " : " + runs[0][2]);
        System.out.println("");
        
        System.out.println(batsmen[1] + " runs scored at " + stadiums[0] + " : " + runs[1][0]);
        System.out.println(batsmen[1] + " runs scored at " + stadiums[1] + " : " + runs[1][1]);
        System.out.println(batsmen[1] + " runs scored at " + stadiums[2] + " : " + runs[1][2]);
        System.out.println("");
        
        System.out.println(batsmen[2] + " runs scored at " + stadiums[0] + " : " + runs[2][0]);
        System.out.println(batsmen[2] + " runs scored at " + stadiums[1] + " : " + runs[2][1]);
        System.out.println(batsmen[2] + " runs scored at " + stadiums[2] + " : " + runs[2][2]);
        System.out.println("");
        
        System.out.println("");
        System.out.println("------------------------------------------------------------");
        System.out.println("TOTAL RUNS AT STADIUMS");
        System.out.println("------------------------------------------------------------");    
    
        for (int i = 0; i < totalRuns.length; ++i) {
            System.out.println(stadiums[i] +"\t" + totalRuns[i]);
        }
        
        //findinf the stadium with the most total runs and displaying it
        mostRuns = totalRuns[0];
        for (int x = 0; x < totalRuns.length; ++x) {
            if (mostRuns < totalRuns[x]) {
                mostRunsIndex = x;
            }
        }
        System.out.println("");
        System.out.println("STADIUM WITH THE MOST RUNS: " + stadiums[mostRunsIndex]);
        System.out.println("------------------------------------------------------------");    
    
        
    }
}
