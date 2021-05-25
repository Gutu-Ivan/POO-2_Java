package Laborator7_exercice10;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

    public class Feres extends JFrame implements ActionListener{
        JComboBox<String> lista;
        public Feres(String titlu){
            super(titlu); setSize(300,200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Container x=getContentPane();
            x.setLayout(new FlowLayout());
            JLabel et=new JLabel("Selectati materia:");
            x.add(et);
            lista=new JComboBox<String>();
            lista.addItem("Matematica");
            lista.addItem("Informatica");
            lista.addItem("Engleza");
            lista.addItem("Alta materie");
            lista.setSelectedItem(2);
            x.add(lista);
            JButton but=new JButton("Ce am selectat?");
            x.add(but);
            but.addActionListener(this);
            setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            JOptionPane.showMessageDialog(this, lista.getSelectedItem());
        }

    }



