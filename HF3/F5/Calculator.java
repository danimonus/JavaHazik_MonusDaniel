package F5;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *Windows kinézetű számológépet valósit meg. JFrame osztályból leszármaztatott osztály.
 * Összeadás/négyzetgyök vonás műveleteket valósitja meg. 
 * Tud kezelni egész, tört és negatív számokat.
 * @author monus
 */
public class Calculator extends JFrame implements ActionListener{

    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;  
    JButton b5;
    JButton b6;
    JButton b7;
    JButton b8;
    JButton b9;
    JButton b10;
    JButton b11;
    JButton b12;
    JButton b13;
    JButton b14;
    JButton b15;
    JButton b16;
    JButton b17;
    JButton b18;
    JButton b19;
    JButton b20;  
    JButton b21;
    JButton b22;
    JButton b23;
    JButton b24;
    JButton b25;
    JButton b26;
    JButton b27;
    JButton b28;
  
    JTextField tf1;
    
    JPanel jp1;
    JPanel jp2;
    JPanel jp3;
    JPanel jp4;
    JPanel jp5;
    JPanel jp6;

    
    public Calculator() throws HeadlessException {
        super("Calculator");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);                
        
        this.b1 = new JButton("");
        this.b2 = new JButton("Backspace");
        this.b3 =  new JButton("CE");
        this.b4 = new JButton("C");
        this.b5 = new JButton("MC");
        this.b6 = new JButton("7");
        this.b7 = new JButton("8");
        this.b8 = new JButton("9");
        this.b9 = new JButton("/");
        this.b10 = new JButton("sqrt");
        this.b11 = new JButton("MR");
        this.b12 = new JButton("4");
        this.b13 =  new JButton("5");
        this.b14 = new JButton("6");
        this.b15 = new JButton("*");
        this.b16 = new JButton("%");
        this.b17 = new JButton("MS");
        this.b18 = new JButton("1");
        this.b19 = new JButton("2");
        this.b20 = new JButton("3");
        this.b21 = new JButton("-");
        this.b22 = new JButton("1/x");
        this.b23 = new JButton("M+");
        this.b24 = new JButton("0");
        this.b25 = new JButton("+/-");
        this.b26 = new JButton(".");
        this.b27 = new JButton("+");
        this.b28 = new JButton("=");
        
        this.tf1 = new JTextField(20);
        
        this.jp1 = new JPanel();
        this.jp2 = new JPanel();
        this.jp3 = new JPanel();
        this.jp4 = new JPanel();
        this.jp5 = new JPanel();
        this.jp6 = new JPanel();
        
        
        
        GridLayout gl = new GridLayout(6,1);
        setLayout(gl);
        GridLayout g1 = new GridLayout(1,6);
        jp1.setLayout(g1);        
        GridLayout g2 = new GridLayout(1,6);
        jp2.setLayout(g2);
        GridLayout g3 = new GridLayout(1,6);
        jp3.setLayout(g3);
        GridLayout g4 = new GridLayout(1,6);
        jp4.setLayout(g4);
        GridLayout g5 = new GridLayout(1,6);
        jp5.setLayout(g5);
        GridLayout g6 = new GridLayout(1,6);
        jp6.setLayout(g6);
        
   
        jp1.add(tf1);
        jp2.add(b1);
        jp2.add(b2);
        jp2.add(b3);
        jp2.add(b4);
        jp3.add(b5);
        jp3.add(b6);
        jp3.add(b7);
        jp3.add(b8);
        jp3.add(b9);
        jp3.add(b10);
        jp4.add(b11);
        jp4.add(b12);
        jp4.add(b13);
        jp4.add(b14);
        jp4.add(b15);
        jp4.add(b16);
        jp5.add(b17);
        jp5.add(b18);
        jp5.add(b19);
        jp5.add(b20);
        jp5.add(b21);
        jp5.add(b22);
        jp6.add(b23);
        jp6.add(b24);
        jp6.add(b25);
        jp6.add(b26);
        jp6.add(b27);
        jp6.add(b28);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);
        b25.addActionListener(this);
        b26.addActionListener(this);
        b27.addActionListener(this);
        b28.addActionListener(this);
        
        
        
        this.add(jp1);
        this.add(jp2);
        this.add(jp3);
        this.add(jp4);
        this.add(jp5);
        this.add(jp6);
        pack();
       
    }
    
    
    
    public static void main(String[] args) {
        
        Calculator c1 = new Calculator();
        
  
    }
    double [] plus = new double[100];
    int n = 0;
    double finalNum = 0;
     String number;
      double a=0;
     
      
      @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b18) {
            tf1.setText(tf1.getText() + "1");
        }
        if (e.getSource() == b19) {
            tf1.setText(tf1.getText() + "2");
        }
        if (e.getSource() == b20) {
            tf1.setText(tf1.getText() + "3");
        }
        if (e.getSource() == b12) {
            tf1.setText(tf1.getText() + "4");
        }
        if (e.getSource() == b13) {
            tf1.setText(tf1.getText() + "5");
        }
        if (e.getSource() == b14) {
            tf1.setText(tf1.getText() + "6");
        }
        if (e.getSource() == b6) {
            tf1.setText(tf1.getText() + "7");
        }
        if (e.getSource() == b7) {
            tf1.setText(tf1.getText() + "8");
        }
        if (e.getSource() == b8) {
            tf1.setText(tf1.getText() + "9");
        }
          if (e.getSource() == b24) {
              tf1.setText(tf1.getText() + "0");
          }

        // 'CE' gomb
        if (e.getSource() == b3) {
            tf1.setText("");
            n = 0;
            finalNum = 0;
            a=0;
        }

        // 'C' gomb
        if (e.getSource() == b4) {
            tf1.setText("");
            n = 0;
            finalNum = 0;
            number = null;
            a = 0;
        }

        // 'Backspace' gomb
        if (e.getSource() == b2) {
            tf1.setText("");
        }

        // '+' gomb
        if (e.getSource() == b27) {
            number = tf1.getText();
            tf1.setText("");
            plus[n++] = Double.parseDouble(number);

        }

        //Gyök gomb
        if (e.getSource() == b10) {
            number = tf1.getText();
            a = Double.parseDouble(number);
            double v = Math.sqrt(a);
            number = String.valueOf(v);
            tf1.setText(number);
        }
        //'+/-' gomb - negatív számok írását teszi lehetővé.
          if (e.getSource() == b25) {
              if (tf1.getText().equals("")) {
                  tf1.setText("-");
              }
          }
          
          //'.' gomb - tört számokhoz
          if (e.getSource() == b26) {
              tf1.setText(tf1.getText()+'.');
          }

        // '=' gomb
        if (e.getSource() == b28) {
            number = tf1.getText();
            plus[n++] = Double.parseDouble(number);
            for (int i = 0; i < n; i++) {
                finalNum += plus[i];
            }
            number = String.valueOf(finalNum);
            tf1.setText(number);

        }

    }
   
}