package exC_individual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartWithEnd extends JFrame implements ActionListener{
	JLabel label1;
    JLabel label2;
    JTextField textField1;
    JTextField textField2;
	
	StartWithEnd(String title){
		super(title);
        setSize(300, 170);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        label1 = new JLabel("Introduce sirul de caractere");
        label2 = new JLabel("Introduce subsirul");
        textField1 = new JTextField(25);
        textField2 = new JTextField(25);
        JButton button = new JButton("Cauta");

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
		boolean compare = textField1.getText().startsWith(textField2.getText());
        boolean compareWithIgnore = textField1.getText().endsWith(textField2.getText());

        JOptionPane.showMessageDialog(this, "Inceputul sirului = " + compare +
                "\nSfarsitul sirului = " + compareWithIgnore);
	}

}
