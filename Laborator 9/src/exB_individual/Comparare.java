package exB_individual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Comparare extends JFrame implements ActionListener{
	JLabel label1;
    JLabel label2;
    JTextField textField1;
    JTextField textField2;
    
    Comparare(String title){
    	super(title);
        setSize(300, 170);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        label1 = new JLabel("Introduce primul sir");
        label2 = new JLabel("Introduce al doilea sir");
        textField1 = new JTextField(25);
        textField2 = new JTextField(25);
        JButton button = new JButton("Compara");

        container.add(label1);
        container.add(textField1);
        container.add(label2);
        container.add(textField2);
        container.add(button);
        button.addActionListener(this);

        setVisible(true);
    }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String compare = textField1.getText().compareTo(textField2.getText()) == 0 ? "egale" : "diferite";
        String compareWithIgnore = textField1.getText().compareToIgnoreCase(textField2.getText()) == 0 ? "egale" : "diferite";


        JOptionPane.showMessageDialog(this, "Sirurile comparate sunt " + compare +
                "\nSirurile comparare cu cazul de ignor sunt " + compareWithIgnore);
	}

}
