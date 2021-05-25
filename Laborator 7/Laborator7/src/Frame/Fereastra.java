package Frame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

    public class Fereastra extends JFrame implements ActionListener{
        Fereastra (String nume) {
            super(nume);
            setSize(250, 100);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Container x = getContentPane();
            x.setLayout(new FlowLayout() );
            JButton A = new JButton("Button 1");
            x.add(A);
            A.addActionListener(this);
            JButton B = new JButton("Button 2");
            x.add(B);
            B.addActionListener(this);
            setVisible(true);

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().compareTo("Button 1")==0)
                JOptionPane.showMessageDialog(this, "Ai apasat Button 1");
            else
                JOptionPane.showMessageDialog(this, "Ai apasat Button 2");
        }
    }




