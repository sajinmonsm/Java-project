package in.orangecounty.sajin;
import javax.swing.*;
import java.awt.event.*;
/**
 * Created by sajin on 20/02/17.
 */
public class SimpleGUIB implements ActionListener  {
    JButton button;
    public static void main (String[] args){
        SimpleGUIB gui =new SimpleGUIB();
        gui.go();
    }
    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("Click Me");
        button.addActionListener(this);
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent actionEvent) {
        button.setText("I've been clicked!");
    }
}
