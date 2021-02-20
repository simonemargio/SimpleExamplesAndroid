package com.example.room;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "studenti")
public class Studente {

    @PrimaryKey
    private int studenteMatricola;

    @ColumnInfo(name = "studente_nome")
    private String nome;

    @ColumnInfo(name = "studente_cognome")
    private String cognome;

    @ColumnInfo(name = "studente_data")
    private String data;

    @ColumnInfo(name = "studente_luogo_nascita")
    private String luogoNascita;


    public int getStudenteMatricola() {
        return studenteMatricola;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getData() {
        return data;
    }

    public String getLuogoNascita() {
        return luogoNascita;
    }

    public void setStudenteMatricola(int studenteMatricola) {
        this.studenteMatricola = studenteMatricola;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setLuogoNascita(String luogoNascita) {
        this.luogoNascita = luogoNascita;
    }
}
