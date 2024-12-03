package firstguisample;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;
import javax.swing.*;
public class FirstGUISample {
static JTextField lname;
static JTextField fname;
static JLabel message;        
    public static void main(String[] args) {
        //JFrame jf = new JFrame("My First GUI");
        
        JFrame jf = new JFrame();
        Image icon = Toolkit.getDefaultToolkit().getImage("messlogo.png");
        //mark.setIconImage(icon);
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        JLabel title = new JLabel("Calculator");
        Font f1 = new Font("Times New Roman", Font.BOLD, 25);
        title.setFont(f1);
        Color c= new Color(61, 56, 200);
        Color c2= new Color(150, 130, 100);
        p1.setBackground(c2);
        title.setForeground(c);
        JLabel jl = new JLabel("NUMBER 1");
        fname = new JTextField(15);
        JLabel j2 = new JLabel("NUMBER 2");
        lname = new JTextField(15);
        JButton b1 = new JButton("ADDITION");
        JButton b2 = new JButton("Clear Form");
        message = new JLabel("");
        
        title.setBounds(70,40,220,40);
        jl.setBounds(50, 100, 100, 30);
        fname.setBounds(120,100,150,30);
        j2.setBounds(50, 150, 100, 30);
        lname.setBounds(120,150,150,30);
        b1.setBounds(50,200,100,30);
        b2.setBounds(180,200,100,30);
        message.setBounds(100,250,300,30);
        //Linear
        jf.setTitle("My First GUI");
        p1.add(jl);
        p1.add(fname);
        p1.add(j2);
        p1.add(lname);
        p1.add(b1);
        p1.add(b2);
        p1.add(message);
        p1.add(title);
        jf.add(p1);
        
        
        
        
        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(true);
        jf.setSize(300, 300);
        jf.setLocation(350,100);
        jf.setVisible(true);
    }
        public class mark implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            double num1 = Double.parseDouble(lname.getText());
            double num2 = Double.parseDouble(fname.getText());
            message.setText("RESULT: "+ (num1+num2));
            lname.setText("");
            fname.setText("");
        }
    }
}
