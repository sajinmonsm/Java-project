package in.orangecounty.sajin;

/**
 * Created by sajin on 04/02/17.
 */
import java.text.DecimalFormat;
public class one {
    public static void main(String[] args) {
        String preset0 = "0.09,0.20,0.09,0.07";
        String[] thisto = preset0.split(",");
        float a = (Float.valueOf(thisto[0])).floatValue();
        System.out.println("[Original]: " + a);
        a = (float) (a + 0.01);
        System.out.printf("[Local]: %.2f \n", a);
        DecimalFormat df = new DecimalFormat();
        df.setMinimumFractionDigits(2);
        df.setMaximumFractionDigits(2);
        System.out.println("[Remote]: " + df.format(a));

    }
}

