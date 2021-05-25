package Laborator7_ecercice8;
import java.awt.*;
import javax.swing.*;



    public class Feres extends JFrame{
        public Feres(String titlu){
            super(titlu);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Toolkit ec = Toolkit.getDefaultToolkit();
            Dimension dim=ec.getScreenSize();
            int i = dim.height;
            int l=dim.width;
            setSize(dim.width, dim.height);
            setVisible(true);
        }
    }

