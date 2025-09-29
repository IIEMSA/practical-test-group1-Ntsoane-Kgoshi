
public class CricketRunsScored extends Cricket{
    //declaration of variables to be used
    String batsmanName, stadiumName;
    int totalRuns;
    
    
    //creating the constructor for this subclass making sure to invoke the super class constrcutor as well
    public CricketRunsScored(int t, String b, String s) {
        super(t, b, s);
        batsmanName = b;
        stadiumName = s;
        totalRuns = t;
    }
    
    //creating a method to generate a report of the cricketer, stadium name and total runs
    //We use the methods originally found in out interface, which is in turn implemented by our super class
    public void printReport() {
        System.out.println("");
        System.out.println("BATSMAN RUNS SCORED REPORT");
        System.out.println("***********************");
        System.out.println("CRICKET PLAYER: "+ getBatsman());
        System.out.println("STADIUM: " + getStadium());
        System.out.println("TOTAL RUNS SCORED: " + getRunsScored());
    }
}
