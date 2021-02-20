package com.example.esercizioservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    ServizioConfrontoNumeri mService;
    boolean mBound = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent intent = new Intent(this, ServizioConfrontoNumeri.class);
        bindService(intent, connection, Context.BIND_AUTO_CREATE);
    }

    public void premutoBottonePrincipale(View v){
        if (mBound) {
             EditText editText=(EditText) findViewById(R.id.editTextNumero);
             int valoreInput=Integer.parseInt(editText.getText().toString());
             mService.confrontaInteri(valoreInput);
        }
    }

    private ServiceConnection connection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName className, IBinder service) {
            ServizioConfrontoNumeri.BinderLocale binder = (ServizioConfrontoNumeri.BinderLocale) service;
            mService = binder.getService();
            mBound = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName arg0) {
            mBound = false;
        }
    };

    @Override
    protected void onStop() {
        super.onStop();
        unbindService(connection);
        mBound = false;
    }
}
