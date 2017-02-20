package in.orangecounty.sajin;

import javax.swing.*;
import java.awt.*;

/**
 * Created by sajin on 20/02/17.
 */
public class Simple {
    int x=70;
    int y=70;
    public static void main(String[] args){
        Simple gui=new Simple();
        gui.go();
    }
    public void go(){
        JFrame frame =new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DrawPanel drawPanel = new DrawPanel();
        frame.getContentPane().add(drawPanel);
        frame.setSize(300,300);
        frame.setVisible(true);
        for(int i=0;i<130;i++){
            x++;
            y++;
            drawPanel.repaint();
            try{
                Thread.sleep(50);

            }catch(Exception ex){}
        }
    }
}
class DrawPanel extends JPanel {
    public void paintComponent(Graphics g){
        g.setColor(Color.green);
        g.fillOval(getX(),getY(), 40,40);
    }
}