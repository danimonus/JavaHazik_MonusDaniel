package F4;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.accessibility.AccessibleState;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *Két sorból beolvassa a napok/órák/percek/másodpercek számát majd a negyedik sorban visszaadja az 
 * összegüket ügyelve a 24/60-as váltásokra.
 * @author monus
 */
public class IdoAtalakito extends JFrame implements ActionListener{

    JPanel jp1;
    JPanel jp2;
    JPanel jp3;
    JPanel jp4;

    JButton jb1;

    JTextField tf1;
    JTextField tf2;
    JTextField tf3;
    JTextField tf4;
    JTextField tf5;
    JTextField tf6;
    JTextField tf7;
    JTextField tf8;
    JTextField tf9;
    JTextField tf10;
    JTextField tf11;
    JTextField tf12;
    
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JLabel l5;
    JLabel l6;
    JLabel l7;
    JLabel l8;
    JLabel l9;
    JLabel l10;
    JLabel l11;
    JLabel l12;
    
    
    
    
    public IdoAtalakito() throws HeadlessException{
    super("IdoAtalakito");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.yellow);         
        this.jb1 = new JButton("Számol");
        this.tf1 = new JTextField(10);
        this.tf2 = new JTextField(10);
        this.tf3 = new JTextField(10);
        this.tf4 = new JTextField(10);
        this.tf5 = new JTextField(10);
        this.tf6 = new JTextField(10);
        this.tf7 = new JTextField(10);
        this.tf8 = new JTextField(10);
        this.tf9 = new JTextField(10);
        this.tf10 = new JTextField(10);
        this.tf11 = new JTextField(10);
        this.tf12 = new JTextField(10);
        this.jp1 = new JPanel();
        this.jp2 = new JPanel();
        this.jp3 = new JPanel();
        this.jp4 = new JPanel();
        this.l1 = new JLabel("nap");
        this.l2 = new JLabel("óra");
        this.l3 = new JLabel("perc");
        this.l4 = new JLabel("másodperc");
        this.l5 = new JLabel("nap");
        this.l6 = new JLabel("óra");
        this.l7 = new JLabel("perc");
        this.l8 = new JLabel("másodperc");
        this.l9 = new JLabel("nap");
        this.l10 = new JLabel("óra");
        this.l11 = new JLabel("perc");
        this.l12 = new JLabel("másodperc");
                
        GridLayout gr = new GridLayout(4,1);
        setLayout(gr);
        GridLayout gr1 = new GridLayout(1,4);
        jp1.setLayout(gr1);
        GridLayout gr2 = new GridLayout(1,4);
        jp2.setLayout(gr2);
        GridLayout gr3 = new GridLayout(1,4);
        jp3.setLayout(gr3);
        GridLayout gr4 = new GridLayout(1,4);
        jp4.setLayout(gr4);
        
        jp1.add(tf1);
        jp1.add(l1);
        jp1.add(tf2);
        jp1.add(l2);
        jp1.add(tf3);
        jp1.add(l3);
        jp1.add(tf4);
        jp1.add(l4);

        jp2.add(tf5);
        jp2.add(l5);
        jp2.add(tf6);
        jp2.add(l6);
        jp2.add(tf7);
        jp2.add(l7);
        jp2.add(tf8);
        jp2.add(l8);
        
        jp3.add(jb1);
        
        jp4.add(tf9);
        jp4.add(l9);
        jp4.add(tf10);
        jp4.add(l10);
        jp4.add(tf11);
        jp4.add(l11);
        jp4.add(tf12);
        jp4.add(l12);
        
        this.add(jp1);
        this.add(jp2);
        this.add(jp3);
        this.add(jp4);
        
        jb1.addActionListener(this);
        
        
        
        pack();
    }
  
    
    
    public static void main(String[] args) {
        
        IdoAtalakito ia = new IdoAtalakito();
        
    }

    int nap;
    int ora;
    int perc;
    int mp;
    
    @Override
    public void actionPerformed(ActionEvent e) {        
        if (e.getSource() == jb1) {
            nap = Integer.parseInt(tf1.getText()) + Integer.parseInt(tf5.getText());
            ora = Integer.parseInt(tf2.getText()) + Integer.parseInt(tf6.getText());
            perc = Integer.parseInt(tf3.getText()) + Integer.parseInt(tf7.getText());
            mp = Integer.parseInt(tf4.getText()) + Integer.parseInt(tf8.getText());
            if (mp>=60) {
                perc++;
                mp-=60;
            }
            if (perc >=60) {
                ora++;
                perc-=60;
            }
            if (ora>=24) {
                nap++;
                ora-=24;
            }
        
            tf9.setText(String.valueOf(nap));
            tf10.setText(String.valueOf(ora));
            tf11.setText(String.valueOf(perc));
            tf12.setText(String.valueOf(mp));
        }

    }
    
    
    
}
