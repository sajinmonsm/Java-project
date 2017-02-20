package in.orangecounty.sajin;

/**
 * Created by sajin on 06/02/17.
 */
public class Overloading {
    String uniqueId;

    public int addnums(int a, int b) {
        return a + b;
    }

    public double addnums(double a, double b) {
        return a + b;
    }

    public void setUniqueId(String theID) {
        uniqueId = theID;
    }

    public void setuniqueID(int ssnumber) {
        String numString = " " + ssnumber;
        setUniqueId(numString);
    }
}
