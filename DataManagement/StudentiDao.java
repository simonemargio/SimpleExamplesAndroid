package com.example.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface StudentiDao {

    @Insert
    public void addStudente(Studente studente);

    @Query("SELECT * FROM studenti")
    List<Studente> getAll();

}
