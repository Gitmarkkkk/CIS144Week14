package travelcostapp;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class TravelCostApp {
static JFrame jf;
static JPanel p1;
static JLabel TotMiles;
static JLabel MPG;
static JLabel PPG;
static JLabel PF;
static JLabel TF;
static JLabel R;
static JTextField NumA;
static JTextField NumB;
static JTextField NumC;
static JTextField NumD;
static JTextField NumEE;
static JTextField NumR;
static JButton BTN;
static JButton BTN2;
    public static void main(String[] args) {
        Font TNR = new Font("Times New Roman", Font.BOLD, 40);
        Font CS = new Font("Comic Sans", Font.PLAIN, 20);
        jf = new JFrame("CIS144-GUI APP");
        p1 = new JPanel();
        p1.setLayout(null);
        JLabel title = new JLabel("<html><u>Travel Cost App</u></html>");
        TotMiles=new JLabel("Enter Total Miles Drive: ");
        MPG=new JLabel("Enter Average Miles Per Gallon: ");
        PPG;
        
        R=new JLabel("RESULT : ");
        
        title.setFont(TNR);
        
        title.setBounds(100,40,600,50);
        
        p1.add(title);
        jf.add(p1);
          
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(true);
        jf.setSize(450, 600);
        jf.setLocation(350,100);
        jf.setVisible(true);
        
    }
    public static class Calculation implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            double a = Double.parseDouble(NumA.getText());
            double b = Double.parseDouble(NumB.getText());
            double c = Double.parseDouble(NumC.getText());
            double d = Double.parseDouble(NumD.getText());
            double ee = Double.parseDouble(NumEE.getText());
            NumR.setText("Calculated Cost: " + (c*(a/b) + d + ee));
        }
    }
}
