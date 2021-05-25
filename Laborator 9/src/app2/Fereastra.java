package app2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Fereastra extends JFrame implements ActionListener{
	String sir;
	JLabel B1;
	JTextField A1;
	public Fereastra (String titlu) {
        super(titlu);
        setSize(300, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container x = getContentPane();
        x.setLayout(new FlowLayout());
        B1 = new JLabel("Dati un sir");
        x.add(B1);
        A1 = new JTextField(25);
        x.add(A1);
        JButton A = new JButton("Rezultat");
        x.add(A);
        A.addActionListener(this);
        setVisible(true);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int k=A1.getText().length();
		JOptionPane.showMessageDialog(this,"Lungimea sirului este: " +k);
	}	
}
