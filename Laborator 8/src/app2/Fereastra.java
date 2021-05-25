package app2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fereastra extends JFrame implements ActionListener{
	public Fereastra (String titlu) {
		super(titlu);
		setSize(250, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container x = getContentPane();
		x.setLayout(new FlowLayout());
		JButton A = new JButton("Click!");
		x.add(A);
		A.addActionListener(this);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object[] butoane = {"Buton 1", "Buton 2", "Buton 3"};
		 int n = JOptionPane.showOptionDialog(this, "Apasati un buton", 
				  "Test showOptionDialog", 
				  JOptionPane.YES_NO_CANCEL_OPTION, 
				  JOptionPane.QUESTION_MESSAGE, null, 
				  butoane, 
				  butoane[2]);
		 if (n == 0) JOptionPane.showMessageDialog(this, "Button 1");
		 else if (n == 1) JOptionPane.showMessageDialog(this, "Button 2");
		 else if (n == 2) JOptionPane.showMessageDialog(this, "Button 3");
	}
}
