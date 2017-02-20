package in.orangecounty.sajin;

import javax.swing.*;
import java.awt.*;

/**
 * Created by sajin on 20/02/17.
 */
public class MyDrawPanel extends JPanel {
    public void painComponent(Graphics g){
        g.setColor(Color.BLUE);
        g.fillOval(20,50,100,100);
    }
}
