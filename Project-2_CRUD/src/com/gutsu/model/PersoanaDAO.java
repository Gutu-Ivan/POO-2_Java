package com.gutsu.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersoanaDAO {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexiunea conectar = new Conexiunea();
    Persoana p = new Persoana();

    public List listar() {
        List<Persoana> datos = new ArrayList<>();
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement("select * from persoana");
            rs = ps.executeQuery();
            while (rs.next()) {
                Persoana p = new Persoana();
                p.setId(rs.getInt(1));
                p.setNume(rs.getString(2));
                p.setPosta(rs.getString(3));
                p.setTelefon(rs.getString(4));
                datos.add(p);
            }
        } catch (Exception e) {
        }
        return datos;
    }
    public int adauga(Persoana per) {  
        int r=0;
        String sql="insert into persoana(Nume,Posta,Telefon)values(?,?,?)";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);            
            ps.setString(1,per.getNume());
            ps.setString(2,per.getPosta());
            ps.setString(3,per.getTelefon());
            r=ps.executeUpdate();    
            if(r==1){
                return 1;
            }
            else{
                return 0;
            }
        } catch (Exception e) {
        }  
        return r;
    }
    public int Updater(Persoana per) {  
        int r=0;
        String sql="update persoana set Nume=?,Posta=?,Telefon=? where Id=?";        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);            
            ps.setString(1,per.getNume());
            ps.setString(2,per.getPosta());
            ps.setString(3,per.getTelefon());
            ps.setInt(4,per.getId());
            r=ps.executeUpdate();    
            if(r==1){
                return 1;
            }
            else{
                return 0;
            }
        } catch (Exception e) {
        }  
        return r;
    }
    public int Delete(int id){
        int r=0;
        String sql="delete from persoana where Id="+id;
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            r= ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
}
