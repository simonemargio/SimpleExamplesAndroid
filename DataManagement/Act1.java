package com.example.room;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Act1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act1);
    }

    public void SalvaInfoDB(View v){
        EditText Nome=(EditText) findViewById(R.id.editTextNome);
        EditText Cognome=(EditText) findViewById(R.id.editTextCognome);
        EditText LuogoNascita=(EditText) findViewById(R.id.editTextLuogoNascita);
        EditText Matricola=(EditText) findViewById(R.id.editTextMatricola);
        EditText Data=(EditText) findViewById(R.id.editTextData);

        String nome=(String) Nome.getText().toString();
        String cognome=(String) Cognome.getText().toString();
        String luogoNascita=(String) LuogoNascita.getText().toString();
        int matricola= Integer.parseInt(Matricola.getText().toString());
        String data=(String) Data.getText().toString();

        Studente studente=new Studente();
        studente.setCognome(cognome);
        studente.setNome(nome);
        studente.setData(data);
        studente.setLuogoNascita(luogoNascita);
        studente.setStudenteMatricola(matricola);

        MainActivity.appDatabase.userDao().addStudente(studente);
        Toast.makeText(getApplicationContext(),"Informazioni salvate",Toast.LENGTH_SHORT).show();
    }

}
