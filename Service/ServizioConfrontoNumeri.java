package com.example.esercizioservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Binder;
import android.widget.Toast;

import java.util.Random;

public class ServizioConfrontoNumeri extends Service {
   private final IBinder binder=new BinderLocale();
   private final Random GenerazioneNumeroCasuale = new Random();

   private int numeroCasuale=0;

   public class BinderLocale extends Binder {
       ServizioConfrontoNumeri getService() {
          numeroCasuale=getNumeroCasuale();
          return ServizioConfrontoNumeri.this;
       }
   }
    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }

    public int getNumeroCasuale() {
        return GenerazioneNumeroCasuale.nextInt(100);
    }

    public void confrontaInteri(int interoPassato){
       if(interoPassato<numeroCasuale) Toast.makeText(this, "Inviato:" + interoPassato  + " Generato:" + numeroCasuale + "\n" + interoPassato + "<" + numeroCasuale, Toast.LENGTH_SHORT).show();
       else
         if(interoPassato>numeroCasuale) Toast.makeText(this, "Inviato:" + interoPassato + " Generato:" + numeroCasuale + "\n" + interoPassato + ">" + numeroCasuale, Toast.LENGTH_SHORT).show();
          else  Toast.makeText(this, "Inviato:" + interoPassato + " Generato:" + numeroCasuale + "\n" + interoPassato + "=" + numeroCasuale, Toast.LENGTH_SHORT).show();
    }
}
