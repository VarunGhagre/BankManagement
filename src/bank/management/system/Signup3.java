package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {

    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6;
    JButton s, c;
    String formno;

    Signup3(String formno) {

        this.formno = formno;

        setLayout(null);
        getContentPane().setBackground(new Color(215, 252, 252));

        // Logo
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        JLabel image = new JLabel(new ImageIcon(i2));
        image.setBounds(150, 10, 100, 100);
        add(image);

        JLabel l1 = new JLabel("Page 3:");
        l1.setFont(new Font("Segoe UI", Font.BOLD, 22));
        l1.setBounds(300, 30, 200, 30);
        add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Segoe UI", Font.BOLD, 22));
        l2.setBounds(280, 60, 300, 30);
        add(l2);

        // Account Type
        JLabel l3 = new JLabel("Account Type:");
        l3.setFont(new Font("Segoe UI", Font.BOLD, 18));
        l3.setBounds(100, 140, 200, 30);
        add(l3);

        r1 = new JRadioButton("Saving Account");
        r1.setBounds(100, 180, 250, 30);
        r1.setBackground(new Color(215, 252, 252));
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setBounds(420, 180, 250, 30);
        r2.setBackground(new Color(215, 252, 252));
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setBounds(100, 220, 250, 30);
        r3.setBackground(new Color(215, 252, 252));
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setBounds(420, 220, 250, 30);
        r4.setBackground(new Color(215, 252, 252));
        add(r4);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1); bg.add(r2); bg.add(r3); bg.add(r4);

        // Card Number
        JLabel l4 = new JLabel("Card Number:");
        l4.setFont(new Font("Segoe UI", Font.BOLD, 18));
        l4.setBounds(100, 280, 200, 30);
        add(l4);

        JLabel l5 = new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        l5.setBounds(100, 310, 250, 20);
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-3472");
        l6.setFont(new Font("Consolas", Font.BOLD, 20));
        l6.setBounds(420, 280, 300, 30);
        add(l6);

        JLabel l7 = new JLabel("It appears on ATM card, cheque book and statements");
        l7.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        l7.setBounds(420, 310, 350, 20);
        add(l7);

        // PIN
        JLabel l8 = new JLabel("PIN:");
        l8.setFont(new Font("Segoe UI", Font.BOLD, 18));
        l8.setBounds(100, 350, 200, 30);
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Consolas", Font.BOLD, 20));
        l9.setBounds(420, 350, 200, 30);
        add(l9);

        JLabel l10 = new JLabel("(4-Digit Password)");
        l10.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        l10.setBounds(100, 380, 200, 20);
        add(l10); 

        // Services
        JLabel l11 = new JLabel("Services Required:");
        l11.setFont(new Font("Segoe UI", Font.BOLD, 18));
        l11.setBounds(100, 430, 250, 30);
        add(l11);

        c1 = new JCheckBox("ATM Card");
        c1.setBounds(100, 470, 200, 30);
        c1.setBackground(new Color(215, 252, 252));
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBounds(420, 470, 200, 30);
        c2.setBackground(new Color(215, 252, 252));
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBounds(100, 510, 200, 30);
        c3.setBackground(new Color(215, 252, 252));
        add(c3);

        c4 = new JCheckBox("Email Alerts");
        c4.setBounds(420, 510, 200, 30);
        c4.setBackground(new Color(215, 252, 252));
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBounds(100, 550, 200, 30);
        c5.setBackground(new Color(215, 252, 252));
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBounds(420, 550, 200, 30);
        c6.setBackground(new Color(215, 252, 252));
        add(c6);

        JCheckBox c7 = new JCheckBox("I hereby declare that the above entered details are correct.",true);
        c7.setBounds(100, 600, 600, 25);
        c7.setBackground(new Color(215, 252, 252));
        add(c7);

        JLabel l12 = new JLabel("Form No : "); 
        l12.setBackground(new Color(252, 205, 75)); 
        l12.setFont(new Font("Raleway", Font.BOLD, 14)); 
        l12.setBounds(700, 10, 100, 30); add(l12); 
        
        JLabel l13 = new JLabel(formno); 
        l13.setBackground(new Color(252, 205, 75)); 
        l13.setFont(new Font("Raleway", Font.BOLD, 14)); 
        l13.setBounds(760, 10, 60, 30); add(l13);

        // Buttons
        s = new JButton("Submit");
        s.setBounds(250, 650, 120, 35);
        s.setBackground(Color.BLACK);
        s.setForeground(Color.WHITE);
        s.addActionListener(this);
        add(s);

        c = new JButton("Cancel");
        c.setBounds(420, 650, 120, 35);
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.addActionListener(this);
        add(c);

        setSize(850, 750);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String atype = null;
        if (r1.isSelected()) {
            atype = "Saving Account";
        } else if (r2.isSelected()) {
            atype = "Fixed Deposit Account";
        } else if (r3.isSelected()) {
            atype = "Current Account";
        } else if (r4.isSelected()) {
            atype = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String cardno = " " + Math.abs(first7);
        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);

        String fac = "";
        if(c1.isSelected()){
            fac = fac+"ATM CARD";
        }else if (c2.isSelected()) {
           fac = fac+"Internet Banking";
        }else if (c3.isSelected()) {
            fac = fac+"Mobile Banking";
        }else if (c4.isSelected()) {
            fac = fac+"EMAIL Alerts";
        }else if (c5.isSelected()) {
            fac = fac+"Cheque Book";
        }else if (c6.isSelected()) {
            fac = fac+"E-Statement";
        }

        try {
            if (e.getSource()==s) {
                if (atype.equals("")) {
                    JOptionPane.showMessageDialog(null, "Fill all the fields");
                }else{
                    Conect c1 = new Conect();
                    String q1 = "insert into signupthree values('"+formno+"', '"+atype+"', '"+cardno+"', '"+pin+"', '"+fac+"')";
                    String q2 = "Insert into login values('"+formno+"', '"+cardno+"', '"+pin+"')"; 
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number : "+cardno+"\n Pin : "+pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            }else if (e.getSource()==c) {
               System.exit(0); 
            }
        } catch (Exception E) {
            // TODO: handle exception
            E.printStackTrace();
        }
        
    }

    public static void main(String[] args) {
        new Signup3("");
    }
}
