package exE_individual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Change extends JFrame{
	JLabel label;
    JTextField textField1, textField2;
    JTextField findField;
    
    Change(String title){
    	super(title);
        setSize(300, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        
        label = new JLabel("Introduce fraza");
        textField1 = new JTextField(20);
        JButton button = new JButton("Inlocuieste");

        container.add(label);
        container.add(textField1);
        container.add(button);
        setVisible(true);
        button.addActionListener(ae -> {
    		try {
    			String first = textField1.getText();
    	        ex5(first);
    	    } catch (Throwable error) {
    	    	System.out.print(error);
    	    }
        });
    }

	public static void ex5(String value) {
	        String str = "__my__";
	        JOptionPane.showMessageDialog(null, "Sirul dupa inlocuirea 'my' cu '__my__' este: " + value.replace("my", str));
	}
}
