package Laborator7_exercice9;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Feres extends JFrame implements ActionListener {

    JPanel panel;
    public Feres(String titlu){
        super(titlu);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container x=getContentPane();
        x.setLayout(new FlowLayout());
        panel=new JPanel();
        JButton A=new JButton("Rosu");
        panel.add(A); A.addActionListener(this);
        JButton B=new JButton("Galben");
        panel.add(B); B.addActionListener(this);
        JButton C=new JButton("Albastru");
        panel.add(C); C.addActionListener(this);
        x.add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String culoare=e.getActionCommand();
        if (culoare.compareTo("Rosu")==0)
            panel.setBackground(Color.red);
        else
        if (culoare.compareTo("Galben")==0)
            panel.setBackground(Color.yellow);
        else
            panel.setBackground(Color.blue);
    }



}
