package Laborator7_exercice11;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Feres extends JFrame implements ActionListener  {

    JCheckBox b1,b2,b3,b4;
    public Feres(String titlu){
        super(titlu); setSize(300,200);
        Container x=getContentPane();
        x.setLayout(new FlowLayout(FlowLayout.LEFT));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel et=new JLabel("Selectati materia:");
        x.add(et);
        b1=new JCheckBox("Matematica");x.add(b1);
        b2=new JCheckBox("Informatica");x.add(b2);
        b3=new JCheckBox("Engleza");x.add(b3);
        b4=new JCheckBox("Alta materie");x.add(b4);
        JButton but=new JButton("Ce am selectat?");
        x.add(but);
        but.addActionListener(this);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (b1.isSelected()) System.out.println(b1.getText());
        if (b2.isSelected()) System.out.println(b2.getText());
        if (b3.isSelected()) System.out.println(b3.getText());
        if (b4.isSelected()) System.out.println(b4.getText());
    }



}
