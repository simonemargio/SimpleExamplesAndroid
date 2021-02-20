package com.example.room;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static AppDatabase appDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        appDatabase= Room.databaseBuilder(getApplicationContext(),AppDatabase.class,"studentidatabase").allowMainThreadQueries().build();
    }

    public void InserisciStudente(View v){
        Intent Act1=new Intent(getApplicationContext(),Act1.class);
        startActivity(Act1);
    }

    public void VisualizzaStudente(View v){
        Intent Act2=new Intent(getApplicationContext(),Act2.class);
        startActivity(Act2);
    }
}
