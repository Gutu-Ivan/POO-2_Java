package Laborator7_exercice12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Feres extends JFrame implements ActionListener{
    ButtonGroup grup;
    public Feres(String titlu){
        super(titlu);
        setSize(300,200);
        Container x=getContentPane();
        x.setLayout(new FlowLayout(FlowLayout.LEFT));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel et=new JLabel("Selectati materia:");
        x.add(et);
        JRadioButton b1=new JRadioButton("Matematica");
        x.add(b1);
        JRadioButton b2=new JRadioButton("Informatica");
        x.add(b2);
        JRadioButton b3=new JRadioButton("Engleza");
        x.add(b3);
        JRadioButton b4=new JRadioButton("Alta materie");
        x.add(b4);
        JButton but=new JButton("Ce am selectat?");
        x.add(but);
        but.addActionListener(this);
        grup = new ButtonGroup();
        grup.add(b1);
        grup.add(b2);
        grup.add(b3);
        grup.add(b4);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Enumeration enum1=grup.getElements();
        while(enum1.hasMoreElements()){
            JRadioButton
                    b=(JRadioButton)enum1.nextElement();
            if(b.isSelected())
                System.out.println(b.getText());
        }
    }

}