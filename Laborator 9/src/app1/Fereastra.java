package app1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fereastra extends JFrame implements ActionListener{
	String sir;
	JLabel B;
	public Fereastra(String titlu) {
        super(titlu);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container x = getContentPane();
        x.setLayout(new FlowLayout());
        JButton A = new JButton("New Data");
        x.add(A);
        A.addActionListener(this);
        B = new JLabel();
        x.add(B);
        setVisible(true);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		sir=JOptionPane.showInputDialog("Cum te numesti?");
		B.setText("Buna ziua "+sir);

	}
}
