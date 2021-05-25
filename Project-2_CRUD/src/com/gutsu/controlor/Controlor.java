package com.gutsu.controlor;

import com.gutsu.model.Persoana;
import com.gutsu.model.PersoanaDAO;
import com.gutsu.vedere.vedere;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Controlor implements ActionListener {

    PersoanaDAO dao = new PersoanaDAO();
    Persoana p = new Persoana();
    vedere vedere = new vedere();
    DefaultTableModel model = new DefaultTableModel();

    public Controlor(vedere v) {
        this.vedere = v;
        this.vedere.btnLista.addActionListener(this);
        this.vedere.btnAdauga.addActionListener(this);
        this.vedere.btnEdita.addActionListener(this);
        this.vedere.btnDelete.addActionListener(this);
        this.vedere.btnUpdater.addActionListener(this);
        this.vedere.btnNou.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vedere.btnLista) {
            clearTabla();
            listar(vedere.tabel);
            nou();
        }
        if (e.getSource() == vedere.btnAdauga) {
            add();
            listar(vedere.tabel);
            nou();
        }
        if (e.getSource() == vedere.btnEdita) {
            int fila = vedere.tabel.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(vedere, "Trebuie să selectați un rând!");
            } else {
                int id = Integer.parseInt((String) vedere.tabel.getValueAt(fila, 0).toString());
                String nume = (String) vedere.tabel.getValueAt(fila, 1);
                String posta = (String) vedere.tabel.getValueAt(fila, 2);
                String tel = (String) vedere.tabel.getValueAt(fila, 3);
                vedere.txtId.setText("" + id);
                vedere.txtNume.setText(nume);
                vedere.txtPosta.setText(posta);
                vedere.txtTel.setText(tel);
            }
        }
        if (e.getSource() == vedere.btnUpdater) {
            Updater();
            listar(vedere.tabel);
            nou();

        }
        if (e.getSource() == vedere.btnDelete) {
            delete();
            listar(vedere.tabel);
            nou();
        }
        if (e.getSource() == vedere.btnNou) {
            nou();
        }

    }

    void nou() {
        vedere.txtId.setText("");
        vedere.txtNume.setText("");
        vedere.txtTel.setText("");
        vedere.txtPosta.setText("");
        vedere.txtNume.requestFocus();
    }

    public void delete() {
        int fila = vedere.tabel.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vedere, "Trebuie să selectați un rând!");
        } else {
            int id = Integer.parseInt((String) vedere.tabel.getValueAt(fila, 0).toString());
            dao.Delete(id);
            System.out.println("Rezultatul este" + id);
            JOptionPane.showMessageDialog(vedere, "Utilizator șters!");
        }
        clearTabla();
    }

    public void add() {
        String nume = vedere.txtNume.getText();
        String posta = vedere.txtPosta.getText();
        String tel = vedere.txtTel.getText();
        p.setNume(nume);
        p.setPosta(posta);
        p.setTelefon(tel);
        int r = dao.adauga(p);
        if (r == 1) {
            JOptionPane.showMessageDialog(vedere, "Utilizator adăugat cu succes.");
        } else {
            JOptionPane.showMessageDialog(vedere, "Error");
        }
        clearTabla();
    }

    public void Updater() {
        if (vedere.txtId.getText().equals("")) {
            JOptionPane.showMessageDialog(vedere, "ID-ul nu este identificat, trebuie să selectați opțiunea Editare");
        } else {
            int id = Integer.parseInt(vedere.txtId.getText());
            String nume = vedere.txtNume.getText();
            String posta = vedere.txtPosta.getText();
            String tel = vedere.txtTel.getText();
            p.setId(id);
            p.setNume(nume);
            p.setPosta(posta);
            p.setTelefon(tel);
            int r = dao.Updater(p);
            if (r == 1) {
                JOptionPane.showMessageDialog(vedere, "Utilizatorul a fost actualizat cu succes.");
            } else {
                JOptionPane.showMessageDialog(vedere, "Error");
            }
        }
        clearTabla();
    }

    public void listar(JTable tabel) {
        centrarCelule(tabel);
        model = (DefaultTableModel) tabel.getModel();
        tabel.setModel(model);
        List<Persoana> lista = dao.listar();
        Object[] obiect = new Object[4];
        for (int i = 0; i < lista.size(); i++) {
            obiect[0] = lista.get(i).getId();
            obiect[1] = lista.get(i).getNume();
            obiect[2] = lista.get(i).getPosta();
            obiect[3] = lista.get(i).getTelefon();
            model.addRow(obiect);
        }
        tabel.setRowHeight(35);
        tabel.setRowMargin(10);

    }

    void centrarCelule(JTable tabel) {
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < vedere.tabel.getColumnCount(); i++) {
            tabel.getColumnModel().getColumn(i).setCellRenderer(tcr);
        }
    }

    void clearTabla() {
        for (int i = 0; i < vedere.tabel.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }
}
