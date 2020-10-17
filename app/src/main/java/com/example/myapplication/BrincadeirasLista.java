package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BrincadeirasLista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_brincadeiras_lista);
    }

    public void futebol(View view) {

        Intent login = new Intent(this, Futebol.class);
        startActivity(login);
    }

    public void basquete(View view) {

        Intent login = new Intent(this, Basquete.class);
        startActivity(login);
    }

    public void escorregador(View view) {

        Intent login = new Intent(this, Escorregador.class);
        startActivity(login);
    }

    public void rodaroda(View view) {

        Intent login = new Intent(this, RodaRoda.class);
        startActivity(login);
    }

    public void balanco(View view) {

        Intent login = new Intent(this, Balanco.class);
        startActivity(login);
    }

    public void skate(View view) {

        Intent login = new Intent(this, Skate.class);
        startActivity(login);
    }

    public void sair(View view) {

        Intent login = new Intent(this, VamosBrincar.class);
        startActivity(login);
    }
}
