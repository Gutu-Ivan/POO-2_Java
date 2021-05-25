package exD_individual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Position extends JFrame implements ActionListener{
	
	JLabel label;
    JTextField textField;
    JTextField findField;
    
    Position(String title){
    	super(title);
        setSize(300, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        label = new JLabel("Introduce fraza");
        textField = new JTextField(20);
        findField = new JTextField(5);
        JButton button = new JButton("Cauta");

        container.add(label);
        container.add(textField);
        container.add(findField);
        container.add(button);
        button.addActionListener(this);

        setVisible(true);
    }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int pos = textField.getText().indexOf(findField.getText());

        JOptionPane.showMessageDialog(this, "Subsirul se afla pe a " + pos + "-a pozitie");
	}
}
