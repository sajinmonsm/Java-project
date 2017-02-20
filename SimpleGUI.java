package in.orangecounty.sajin;
import javax.swing.*;

/**
 * Created by sajin on 20/02/17.
 */
public class SimpleGUI {
    public static void main(String [] args){
        JFrame frame=new JFrame();
        JButton button = new JButton("Click Me");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300,300);
        frame.setVisible(true) ;
    }
}