package in.orangecounty.sajin;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by sajin on 20/02/17.
 */
public class Simplegui3C implements ActionListener  {
    JFrame frame;
    public static void main (String[] args){
        Simplegui3C gui =new Simplegui3C();
        gui.go();
    }
    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button =new JButton("Change Colors");
        button.addActionListener(this);
        MyDrawPanel drawPanel = new MyDrawPanel();
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent actionEvent) {
        frame.repaint();
    }
}
