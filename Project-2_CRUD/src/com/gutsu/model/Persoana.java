
package com.gutsu.model;

public class Persoana {
    int id;
    String nume;
    String posta;
    String telefon;

    public Persoana() {
    }

    public Persoana(int id, String nume, String posta, String telefon) {
        this.id = id;
        this.nume = nume;
        this.posta = posta;
        this.telefon = telefon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPosta() {
        return posta;
    }

    public void setPosta(String posta) {
        this.posta = posta;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    
    
}
