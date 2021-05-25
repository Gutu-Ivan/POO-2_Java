package app1;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Fereastra extends JFrame implements ActionListener{
	public Fereastra(String titlu) {
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar bara = new JMenuBar();
		JMenu meniu1 = new JMenu("Operatii 1");
		bara.add(meniu1);
		JMenuItem item11 = new JMenuItem("Operatia 11");
		meniu1.add(item11);
		item11.addActionListener(this);
		JMenuItem item12 = new JMenuItem("Operatia 12");
		meniu1.add(item12);
		item12.addActionListener(this);
		JMenu altele = new JMenu("Altele");
		meniu1.add(altele);
		JMenuItem item131 = new JMenuItem("Operatia 131");
		altele.add(item131);
		item131.addActionListener(this);
		JMenuItem item132 = new JMenuItem("Operatia 132");
		altele.add(item132);
		item132.addActionListener(this);
		JMenu meniu2 = new JMenu("Operatii 2");
		bara.add(meniu2);
		JMenuItem item21 = new JMenuItem("Operatia 21");
		meniu2.add(item21);
		item21.addActionListener(this);
		JMenuItem item22 = new JMenuItem("Operatia 22");
		meniu2.add(item22);
		item22.addActionListener(this);
		setJMenuBar(bara);
		setResizable(false);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().compareTo("Operatia 11") == 0) {
			JOptionPane.showMessageDialog(this, "Operatia 11");
		} else if (e.getActionCommand().compareTo("Operatia 12") == 0) {
			JOptionPane.showMessageDialog(this, "Operatia 12");
		} else if (e.getActionCommand().compareTo("Operatia 131") == 0) {
			JOptionPane.showMessageDialog(this, "Operatia 131");
		} else if (e.getActionCommand().compareTo("Operatia 132") == 0) {
			JOptionPane.showMessageDialog(this, "Operatia 132");
		} else if (e.getActionCommand().compareTo("Operatia 21") == 0) {
			JOptionPane.showMessageDialog(this, "Operatia 21");
		} else if (e.getActionCommand().compareTo("Operatia 22") == 0) {
			JOptionPane.showMessageDialog(this, "Operatia 22");
		}
	}
	
	
}
