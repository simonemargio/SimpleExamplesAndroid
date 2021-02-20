package com.example.room;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class Act2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);

        TextView info=(TextView) findViewById(R.id.textViewDB);
        List<Studente> studenti = MainActivity.appDatabase.userDao().getAll();

        String mostraStudente = "";

        for(Studente stud : studenti){
            String nome=stud.getNome();
            String cognome=stud.getCognome();
            String luogoNascita=stud.getLuogoNascita();
            int matricola=stud.getStudenteMatricola();
            String data=stud.getData();
            mostraStudente=mostraStudente + "\nMatricola: " + matricola + "\nNome: " + nome + "\nCognome: " + cognome + "\nData nascita: " + data + "\nLuogo nascita: " + luogoNascita + "\n\n";
        }
        info.setText(mostraStudente);
    }
}
