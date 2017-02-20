package in.orangecounty.sajin;

/**
 * Created by sajin on 03/02/17.
 */
public class SimpleDotCom {
    int[] locationCells;
    int numofHits=0;
    public void setLocationCells (int[] locs){
        locationCells = locs;

    }
    public String checkYourself(String stringGuess){
        int guess =Integer.parseInt(stringGuess);
        String result="miss";
        for (int cell :locationCells){
            if(guess==cell){
                result="hit";
                numofHits++;
                break;
            }
        }
        if(numofHits == locationCells.length){
            result="Kill";


        }
        System.out.println(result);
        return result;
    }
}
