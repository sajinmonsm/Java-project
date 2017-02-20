package in.orangecounty.sajin;
import java.util.Calendar;
import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Created by sajin on 10/02/17.
 */
public class Moon {
    static int DAY_IM = 1000 * 60 * 60 * 24;

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2016, 0, 7, 15, 40);
        long day1 = c.getTimeInMillis();
        for (int x = 0; x < 60; x++) {
            day1 += (DAY_IM * 29.52);
            c.setTimeInMillis(day1);
            out.println(format("full moon on %tc",c ));

        }

    }
}
