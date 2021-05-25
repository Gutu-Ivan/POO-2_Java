package exF_individual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Numbers extends JFrame{
	JLabel label;
    JTextField textField1, textField2;
    JTextField findField;

    Numbers(String title){
    	super(title);
        setSize(300, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        
        label = new JLabel("Introduce fraza");
        textField1 = new JTextField(20);
        JButton button = new JButton("Numara");

        container.add(label);
        container.add(textField1);
        container.add(button);
        setVisible(true);
        button.addActionListener(ae -> {
    		try {
    			String first = textField1.getText();
    	        ex6(first);
    	    } catch (Throwable error) {
    	    	System.out.print(error);
    	    }
        });
    }

	
    public static void ex6(String value) {
        String[] words = value.split(" ");
        JOptionPane.showMessageDialog(null, "Sirul contine " + words.length + " cuvinte");
    }

}