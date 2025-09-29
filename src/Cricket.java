
public abstract class Cricket implements iCricket{
    //declaration of variables to be used
    String batsmanName, stadiumName;
    int totalRuns;
    
    
    //Creating the constructor for our super class, including the btasman and stadium name and total runs as parameters
    public Cricket(int t, String b, String s) {
        batsmanName = b;
        stadiumName = s;
        totalRuns = t;
    }
    
    
    //implementing the 3 methods which are found in our interface
    //each of them returns the relevant variable
    @Override  
    public String getBatsman() {
        return batsmanName;
    }
    
    @Override
    public String getStadium() {
        return stadiumName;
    }
   
    @Override
    public int getRunsScored() {
        return totalRuns;
    }
    
    
    
    
}
