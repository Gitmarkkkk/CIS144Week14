
package travelcostapp;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.Font;
public class TravelCostApp {


    public static void main(String[] args) {
        JFrame jf = new JFrame();
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        JLabel title = new JLabel("Travel Cost App");
        String underline = "\u001B[4m";
        String reset = "\u001B[0m";
        Font TNR = new Font("Times New Roman", Font.BOLD, 30);
        title.setFont(TNR);
        JLabel newtitle = new JLabel(underline + title + reset);
        
        title.setBounds(70,40,220,40);
        newtitle.setBounds(70,80,220,40);
        
        p1.add(title);
        p1.add(newtitle);
        jf.add(p1);
          
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(true);
        jf.setSize(300, 300);
        jf.setLocation(350,100);
        jf.setVisible(true);
    }
    
}
