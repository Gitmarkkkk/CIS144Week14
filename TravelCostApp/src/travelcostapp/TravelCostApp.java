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
        Color MildBlue = new Color(153,204,255);
        Color MildGreen = new Color(153,255,153);
        jf = new JFrame("CIS144-GUI APP");
        p1 = new JPanel();
        p1.setLayout(null);
        JLabel title = new JLabel("<html><u>Travel Cost App</u></html>");
        TotMiles=new JLabel("1) Enter Total Miles Driven: ");
        MPG=new JLabel("2) Enter Average Miles Per Gallon: ");
        PPG=new JLabel("3) Enter Price per Gallon: ");
        PF=new JLabel("4) Enter Amount Paid for Parking Fees: ");
        TF=new JLabel("5) Enter Amount Paid for Toll Fees: ");
        R=new JLabel("");
        title.setFont(TNR);
        NumA = new JTextField(10);
        NumA.setBackground(MildBlue);
        NumB = new JTextField(10);
        NumB.setBackground(MildBlue);
        NumC = new JTextField(10);
        NumC.setBackground(MildBlue);
        NumD = new JTextField(10);
        NumD.setBackground(MildBlue);
        NumEE = new JTextField(10);
        NumEE.setBackground(MildBlue);
        NumR = new JTextField(10);
        NumR.setBackground(MildBlue);
        
        title.setBounds(100,40,600,50);
        TotMiles.setBounds(100, 100, 400, 20);
        NumA.setBounds(255, 100, 40, 20);
        MPG.setBounds(100, 120, 400, 20);
        NumB.setBounds(295, 120, 40, 20);
        PPG.setBounds(100, 140, 400, 20);
        NumC.setBounds(245, 140, 40, 20);
        PF.setBounds(100, 160, 400, 20);
        NumD.setBounds(325, 160, 40, 20);
        TF.setBounds(100, 180, 400, 20);
        NumEE.setBounds(300, 180, 40, 20);
        R.setBounds(100, 200, 400, 20);
        NumR.setBounds(255, 100, 40, 20);
        
        p1.add(title);
        p1.add(TotMiles);
        p1.add(NumA);
        p1.add(MPG);
        p1.add(NumB);
        p1.add(PPG);
        p1.add(NumC);
        p1.add(PF);
        p1.add(NumD);
        p1.add(TF);
        p1.add(NumEE);
        p1.add(R);
        p1.add(NumR);
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
