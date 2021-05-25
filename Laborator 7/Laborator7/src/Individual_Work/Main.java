package Individual_Work;
import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JFrame f = new JFrame("Sum");
        JTextField label1 =  new JTextField(160);
        JTextField label2 = new JTextField(160);
        JTextField label3 = new JTextField(160);
        JButton a = new JButton("Calculate");

        label1.setBounds(100, 0, 200, 40);
        label2.setBounds(100, 50, 200, 40);
        label3.setBounds(100, 100, 200, 40);
        a.setBounds(100, 150, 200, 40);

        f.add(a);
        f.add(label1);
        f.add(label2);
        f.add(label3);

        a.addActionListener(ae -> {
            int firstnumber = Integer.parseInt(label1.getText());
            int secondnumber = Integer.parseInt(label2.getText());
            label3.setText(firstnumber + secondnumber + "");
        });

        f.setSize(435, 540);
        f.setLayout(null);
        f.setVisible(true);
    }



}
